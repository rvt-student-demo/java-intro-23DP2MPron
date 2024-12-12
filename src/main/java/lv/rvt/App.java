package lv.rvt;
import java.util.List;
import java.util.Scanner;

public class App {
        public static void main(String[] args) {
            SimpleDate date = new SimpleDate(24, 3, 2017);
            SimpleDate date2 = new SimpleDate(23, 7, 2017);
    
            Person leo = new Person("Leo", date, 62, 9);
            Person lily = new Person("Lily", date2, 65, 8);
    
            if (leo.equals(lily)) {
                System.out.println("Is this quite correct?");
            } else {
                System.out.println("Leo and Lily are not the same.");
            }
    
            Person leoWithDifferentWeight = new Person("Leo", date, 62, 10);
    
            if (leo.equals(leoWithDifferentWeight)) {
                System.out.println("Is this quite correct?");
            } else {
                System.out.println("Leo with different weight is not the same as the original Leo.");
            }
        }
    }
    
