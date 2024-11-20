package lv.rvt;
import java.util.*;
import java.io.*;

public class App {
 
        public static void main(String[] args) throws Exception {
            ArrayList<Person> people = PersonManager.getPersonList();
            for (Person person : people) {
                System.out.println(person);
            }
        }
    }
    

