package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi savu vardu:");

        String name = scanner.nextLine();

        System.out.println("Ievadi savu uzvardu:");
        String lastname = scanner.nextLine();

        System.out.println("Ievadi savu grupu:");
        String group = scanner.nextLine();

        System.out.println("Students: " + name + " " + lastname + ", group: " + group );


    }

}
