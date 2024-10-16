package lv.rvt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer (0 to stop): ");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            numbers.add(num);
        }

        if (numbers.size() >= 3) {
            int sum = numbers.get(1) + numbers.get(2);
            System.out.println("The sum of the second and third numbers is: " + sum);
        }
        int summa = 0;
        for (int num : numbers) {
            summa += num;
        }
        System.out.println("Sum: " + summa);
    }
}



