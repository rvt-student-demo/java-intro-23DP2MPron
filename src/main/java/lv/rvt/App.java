package lv.rvt;
import java.rmi.server.SocketSecurityException;
import java.util.*;
public class App {
    public class MainProgram {
        public static void main(String[] args) {
            PaymentCard card = new PaymentCard(5);
            System.out.println(card);
    
            card.eatHeartily();
            System.out.println(card);
    
            card.eatHeartily();
            System.out.println(card);
        }
    }
}