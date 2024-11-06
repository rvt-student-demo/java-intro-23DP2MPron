package lv.rvt;
import java.util.*;
public class Room {
    private String code;
    private int seats;

    public Room(String classCode, int numberOfSeats){
        this.code = classCode;    
        this.seats = numberOfSeats;
    }
    public String getCode() {
        return code;
    }

    public int getSeats() {
        return seats;
    }
}
