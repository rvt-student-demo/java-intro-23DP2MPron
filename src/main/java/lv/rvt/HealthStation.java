package lv.rvt;

public class HealthStation {
    public int weigh(Person person) {
        int weight = person.getWeight();
        return weight;
    }
    public void feed(Person person){
        person.increaseWeight(1);
        
    }

}
