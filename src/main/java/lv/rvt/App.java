package lv.rvt;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
     public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);
    }

    // Method to print all persons in the list
    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }
    }
    
