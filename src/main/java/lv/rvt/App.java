package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    
        Scanner scanner = new Scanner(System.in);
        
                    
        int chet = 0;
        int sum = 0; 
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + chet);
                System.out.println("Average: " + (double) sum / chet);
                break;
            }
            
            else {
                chet = chet + 1;
                sum = sum + number; 
                continue;
            }
        
    }

}
}


