package TP6;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Create at least one Object of each subclasses
        Book lure = new Book("How to lure a human", "Alice Winters", "romance/supernatural");
        Magazine gq = new Magazine("GQ", "Adam Baidawi", "Monthly");
        AdultSubscriber cath = new AdultSubscriber("Cath", 49, "annual");
        ChildSubscriber moumoute = new ChildSubscriber("Maude", 13, "niece");

        // Sort them in lists
        ArrayList<Subscriber> subscribers = new ArrayList<>(List.of(cath, moumoute));
        ArrayList<Resource> resources = new ArrayList<>(List.of(lure, gq));

        // Display via loops
        for (Subscriber sub : subscribers) sub.display();
        for (Resource res : resources) res.display();
    }

}
