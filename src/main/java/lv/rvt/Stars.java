package lv.rvt;
import java.util.*;

public class Stars {
    public static void printSquare(int num) {
        for(int m = 1; m <= num; m++){
            for(int i = 1; i <= num; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printStars(int number) {
        for(int i = 1; i <= number; i++){
            System.out.print("*");
        }
        System.out.println();
    }


    public static void printRectangle(int w, int h) {
        for(int m = 1; m <= h; m++){
            for(int i = 1; i <= w; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

