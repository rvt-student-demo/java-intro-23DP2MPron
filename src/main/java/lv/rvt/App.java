package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    
        Scanner scanner = new Scanner(System.in);
        
                    
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        int fakt = 1;
        for (int i = 1; i < number; i ++) {
            fakt = fakt * (i + 1);
            
        }
        System.out.println(fakt);
             
            

        
    }

    
}


