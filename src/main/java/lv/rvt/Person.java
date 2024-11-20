package lv.rvt;


public class Person {
    private String name;
    private int age;
    private int height; 
    private int weight; 

    public Person(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String toString(){
        return name + ", " + age + ", " + weight + ", " + height;
    }
}

