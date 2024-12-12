package lv.rvt;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersonManager {
    private String csvFile;

    public PersonManager(String csvFile) {
        this.csvFile = csvFile;
    }

    public List<Person> getAllPersons() {
        List<Person> persons = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    try {
                        String name = data[0];
                        int age = Integer.parseInt(data[1]);
                        double height = Double.parseDouble(data[2]);
                        double weight = Double.parseDouble(data[3]);
                        
                        if (height > 0 && weight > 0) {
                            persons.add(new Person(name, age, height, weight));
                        } else {
                            System.out.printf("Skipping invalid entry (invalid height/weight): %s%n", line);
                        }
                    } catch (NumberFormatException e) {
                        System.out.printf("Skipping invalid entry (number format): %s%n", line);
                    }
                } else {
                    System.out.printf("Skipping invalid entry (incorrect format): %s%n", line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return persons;
    }
    

    public void addPerson(String person) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile, true))) {
            bw.write(person);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public void show() {
        List<Person> persons = getAllPersons();
        System.out.printf("%-20s %-5s %-10s %-10s %-10s%n", "Name", "Age", "Height (m)", "Weight (kg)", "BMI");
        System.out.println("----------------------------------------------------------");
        for (Person person : persons) {
            System.out.printf("%-20s %-5d %-10.2f %-10.2f %-10.2f%n",
                    person.getName(),
                    person.getAge(),
                    person.getHeight(),
                    person.getWeight(),
                    person.calculateBMI());
        }
    }
}


