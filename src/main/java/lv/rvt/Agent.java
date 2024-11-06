package lv.rvt;

public class Agent {
    private String firstName;
    private String lastName;
    public Agent (String intFirstName, String intLastName) {
        this.firstName = intFirstName;
        this.lastName = intLastName;
    }
    public String toString(){
        return("My name is " + this.lastName + ", " + this.firstName + " " + this.lastName);
    }
}
