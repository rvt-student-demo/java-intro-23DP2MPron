package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        printText(number);
        

    
    }

    public static void printText(int number){
        int i = 1;
        while (i <= number) {
            System.out.println(i);
            i++;
           
        }
            
            
        
    }

}



