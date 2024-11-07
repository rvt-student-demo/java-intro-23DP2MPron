package lv.rvt;
import java.rmi.server.SocketSecurityException;
import java.util.*;
public class App {
    public class MainProgram {
        public static void main(String[] args) {
            PaymentCard card = new PaymentCard(50);
            System.out.println(card); 
    
            card.eatAffordably(); 
            System.out.println(card); 
    
            card.eatHeartily();
            card.eatAffordably();
            System.out.println(card); 
        }
    }
}