package lv.rvt;
import java.util.*;

public class Stars {
    public static void printSquare(int num) {
        for(int m = 1; m <= num; m++){
            printStars(num);
            System.out.println();
        }
    }
    public static void printStars(int number) {
        for(int i = 1; i <= number; i++){
            System.out.print("*");
        }
    }


    public static void printRectangle(int w, int h) {
        for(int m = 1; m <= h; m++){
            printStars(w);
            System.out.println();
            }
            
        }
    
    public static void printTriangle(int w) {
        for(int i = 1; i <= w; i++) {
            printStars(i);
            System.out.println();
        }
    }
}

