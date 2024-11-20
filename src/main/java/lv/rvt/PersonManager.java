package lv.rvt;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PersonManager {

    public static ArrayList<Person> getPersonList() {
        ArrayList<Person> personList = new ArrayList<>();
        String filePath = "/workspaces/java-intro-23DP2MPron/data/persons.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(","); 
                if (values.length >= 2) {
                    String name = values[0].trim();
                    int age = Integer.parseInt(values[1].trim());
                    int height = Integer.parseInt(values[3].trim());
                    int weight = Integer.parseInt(values[2].trim());
                    Person person = new Person(name, age, weight, height);
                    personList.add(person);
                }
            }
        } catch (IOException e) {
            System.err.println("Kļūda lasot failu: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Nepareizs vecuma formāts: " + e.getMessage());
        }

        return personList;
    }
}
