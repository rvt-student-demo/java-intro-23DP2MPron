package lv.rvt;
import java.util.*;
public class App {
   
        public static void main(String[] args) {
            
            PaymentCard paulsCard = new PaymentCard(20);
           
            PaymentCard mattsCard = new PaymentCard(30);
    
            
            paulsCard.eatHeartily();
           
            mattsCard.eatAffordably();
    
          
            System.out.println("Paul's card: " + paulsCard);
            System.out.println("Matt's card: " + mattsCard);
    
           
            paulsCard.lataaRahaa(20);
            
            mattsCard.eatHeartily();
    
           
            System.out.println("Paul's card: " + paulsCard);
            System.out.println("Matt's card: " + mattsCard);
    
            
            paulsCard.eatAffordably();
            paulsCard.eatAffordably();
    
            
            mattsCard.lataaRahaa(50);
    
           
            System.out.println("Paul's card: " + paulsCard);
            System.out.println("Matt's card: " + mattsCard);
        }
    }
