package TP6;

public class Subscriber {
    // Private attributes
    private String name;
    private int age;

    // Constructor
    public Subscriber(String name, int age ){
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Display the attributes
    public void display(){
        System.out.printf("%s - %d ans%n", getName(), getAge());
    }
}
