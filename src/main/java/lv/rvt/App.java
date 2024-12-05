package lv.rvt;
import java.util.*;
import java.io.*;
import java.nio.file.StandardOpenOption;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        boolean isProgramRunning = true;
        while (isProgramRunning) {
            String command = scanner.nextLine();
            
            if (command.equals("exit")) {
                System.out.println("Thanks, bye bye!");
                isProgramRunning = false;
            } else if (command.equals("show")){
                System.out.println(PersonManager.getPersonList());
            }
        }
    }
}