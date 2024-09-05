package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chiken:");
        String chiken = scanner.nextLine();
        System.out.println("Bacon:");
        String bacon = scanner.nextLine();
        System.out.println("Tractor:");
        String tractor = scanner.nextLine();

        System.out.println("Chicken:");
        System.out.println( chiken);
        System.out.println("Bacon:");
        System.out.println(bacon);
        System.out.println("Tractor:");
        System.out.println(tractor);
        System.out.println("And finally, a summary:" );
        System.out.println( chiken);
        System.out.println(bacon);
        System.out.println(tractor);
    }

}
