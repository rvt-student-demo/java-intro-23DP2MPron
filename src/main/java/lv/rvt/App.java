package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in);

        // Mes gribam uzzinat no lietitaja: Vardu, Uzvardu, Gruppu?\

        // Un beigas printet visu kopa viena rinda 

        System.out.println("Ievadi savu vardu: ");
        String name = scanner.nextLine();

        System.out.println("Ievadi savu uzvardu: ");
        String uzname = scanner.nextLine();

        System.out.println("Ievadi savu gruppu: ");
        String grup = scanner.nextLine();


        System.out.println(name + " " + uzname + " " + grup);
    }

}
