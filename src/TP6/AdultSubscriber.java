package TP6;

public class AdultSubscriber extends Subscriber{
    // Private attributes
    private String subscription;

    // Constructor
    public AdultSubscriber(String name, int age, String subscription){
        super(name, age);
        this.subscription = subscription;
    }

    // Getter
    public String getSubscription() {
        return subscription;
    }

    // Setter
    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }

    // Override display to include the new attribute
    // Important because the parent class doesn't know the child class' attributes, meaning it will never be able to display them
    @Override
    public void display(){
        System.out.printf("%s - %d ans - %s%n", getName(), getAge(), getSubscription());
    }
}
