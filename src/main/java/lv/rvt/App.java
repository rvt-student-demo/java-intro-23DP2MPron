package lv.rvt;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonManager personManager = new PersonManager("persons.csv");
        String command;

        System.out.println("Welcome to the Person Manager!");
        System.out.println("Type 'help' for a list of commands.");

        while (true) {
            System.out.print("> ");
            command = scanner.nextLine().trim().toLowerCase();

            switch (command) {
                case "show":
                    List<String> persons = personManager.getAllPersons();
                    if (persons.isEmpty()) {
                        System.out.println("No persons found.");
                    } else {
                        System.out.println("Persons:");
                        for (String person : persons) {
                            System.out.println(person);
                        }
                    }
                    break;

                case "add":
                    System.out.print("Enter person details (e.g., Name, Age): ");
                    String personDetails = scanner.nextLine();
                    personManager.addPerson(personDetails);
                    System.out.println("Person added.");
                    break;

                case "help":
                    System.out.println("Available commands:");
                    System.out.println("show - Displays all persons from the CSV file.");
                    System.out.println("add - Adds a person to the CSV file.");
                    System.out.println("help - Displays available commands.");
                    System.out.println("exit - Stops the program.");
                    break;

                case "exit":
                    System.out.println("Thanks, bye bye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Unknown command. Type 'help' for a list of commands.");
                    break;
            }
        }
    }
}