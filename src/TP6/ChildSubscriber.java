package TP6;

public class ChildSubscriber extends Subscriber {
    // Private attributes
    private String category;

    // Constructor
    public ChildSubscriber(String name, int age, String category){
        super(name, age);
        this.category = category;
    }

    // Getter
    public String getCategory() {
        return category;
    }

    // Setter
    public void setCategory(String category) {
        this.category = category;
    }

    // Override display to include the new attribute
    @Override
    public void display(){
        System.out.printf("%s - %d ans - %s%n", getName(), getAge(), getCategory());
    }
}
