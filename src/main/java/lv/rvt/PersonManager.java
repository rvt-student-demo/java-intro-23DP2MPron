package lv.rvt;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersonManager {
    private String csvFile;

    public PersonManager(String csvFile) {
        this.csvFile = csvFile;
    }

    public List<String> getAllPersons() {
        List<String> persons = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                persons.add(line);
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
}
