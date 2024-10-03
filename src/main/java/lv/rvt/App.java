package lv.rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a 2 number:");
        int number2 = Integer.valueOf(scanner.nextLine());
        printText(number, number2);
    }

    public static void printText(int number, int number2) {
        for (int i = number; i <= number2; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}



