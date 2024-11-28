package lv.rvt;

public class HealthStation {
    private int weighingCount;
    public int weigh(Person person) {
        weighingCount ++;
        int weight = person.getWeight();
        return weight;
    }

    public void feed(Person person){
        person.increaseWeight(1); 
    }

    public int weighings() {
        return weighingCount;
    }

}
