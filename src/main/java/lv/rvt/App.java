package lv.rvt;
import java.rmi.server.SocketSecurityException;
import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
            Statistics statistics = new Statistics();{
            System.out.println("Enater numbers:");
            while (true) {
                int input = Integer.valueOf(scanner.nextLine());
                if (input == -1) {
                    break;
                }
                if (input %2 == 0){
                    even.addNumber(input);
                }
                else{
                    odd.addNumber(input);
                }
                statistics.addNumber(input);
            }
        }   System.out.println("Sum " + statistics.sum());
            System.out.println("Sum of even numbers: " + even.sum());
            System.out.println("Sum of odd numbers: " + odd.sum());
    }
}