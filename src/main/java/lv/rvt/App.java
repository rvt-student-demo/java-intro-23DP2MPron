package lv.rvt;
import java.rmi.server.SocketSecurityException;
import java.util.*;
public class App {
    public class MainProgram {
        public static void main(String[] args) {
            PaymentCard card = new PaymentCard(10);
            System.out.println(card);
    
            card.addMoney(15);
            System.out.println(card);
    
            card.addMoney(10);
            System.out.println(card);
    
            card.addMoney(200);
            System.out.println(card);
        }
    }
}