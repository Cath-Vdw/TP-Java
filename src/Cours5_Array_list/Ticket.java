package Cours5_Array_list;

public class Ticket {
    // Privates attributes
    private int id;                 // unique identification
    private String description;     // content of the ticket
    private boolean isTreated;      // whether the ticket is complete or not (false by default)

    // Constructor
    public Ticket(int id, String description) {
        this.id = id;
        this.description = description;
        // Ticket not needed - false by default
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isTreated() {
        return isTreated;
    }

    // Methods

    public void treatingTicket() {
        if (!isTreated) isTreated = true;
    }

    @Override
    public String toString() {
        String status = isTreated ? "treated" : "current"; // equals to a toString override
        return id + " - " + description + " (" + status + ")";
    }
}
