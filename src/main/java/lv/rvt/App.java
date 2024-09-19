package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        
        Scanner reader = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(reader.nextLine());

        if (gift < 5000) {
            System.out.println("No tax!");
        }
        
        else if (gift < 25000) {
            System.out.println(100 + (gift - 5000) * 0.08);
        }

        else if (gift < 55000) {
            System.out.println(1700 + (gift - 25000) * 0.1);
        }

        else if (gift < 200000) {
            System.out.println(4700 + (gift - 55000) * 0.12);
        }

        else if (gift < 1000000) {
            System.out.println(22100 + (gift - 200000) * 0.15);
        }

        else if (gift >= 1000000) {
            System.out.println(142100 + (gift - 1000000) * 0.17);
        }
    }


}
