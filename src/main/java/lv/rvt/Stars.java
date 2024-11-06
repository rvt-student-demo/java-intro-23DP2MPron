package lv.rvt;

import java.util.*;

public class Stars {
    public static void printStars(int number) {
        for(int i = 1; i <= number; i++){
            System.out.print("*");
        }
    }
    
    public static void printSpaces(int number) {
        for(int i = 1; i <= number; i++){
            System.out.print(" ");
        }
    }
    
    public static void printTriangle(int size) {
        for(int i = 1; i <= size; i++){
            printSpaces(size - i);
            printStars(i);
            System.out.println();
        }
    }
    public static void christmasTree(int h){
        for(int i = 1; i <= h * 2; i += 2){
            printSpaces((h - i) * 2);
            printStars(i);
            System.out.println();
        }
        
    }
}