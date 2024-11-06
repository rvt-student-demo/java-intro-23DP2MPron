package lv.rvt;
import java.util.*;
public class App {
    public static void main(String[] args) {
        Person matti = new Person("Matti");
        Person juhana = new Person("Juhana");
        Person es = new Person("Maksym");

        es.setHeight(182);
        es.setWeight(87);
    
        matti.setHeight(180);
        matti.setWeight(86);
    
        juhana.setHeight(175);
        juhana.setWeight(64);
    
        System.out.println(matti.getName() + ", body mass index is " + matti.bodyMassIndex());
        System.out.println(juhana.getName() + ", body mass index is " + juhana.bodyMassIndex());
        System.out.println(es.getName() + ", body mass index is " + es.bodyMassIndex());
    }
}