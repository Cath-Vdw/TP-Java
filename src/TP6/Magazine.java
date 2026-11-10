package TP6;

public class Magazine extends Resource{
    // Private attribute
    private String periodicity;     // add another attribute to the ones from the parent Class

    // Constuctor
    public Magazine(String title, String author, String periodicity){
        super(title, author);       // inherit the same constructor as Resource
        this.periodicity = periodicity;
    }

    // Getter
    public String getPeriodicity() {
        return periodicity;
    }

    // Setter
    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }

    // Override display to include the new attribute
    @Override
    public void display(){
        System.out.printf("%s - %s (%s)%n", getAuthor(), getTitle(), getPeriodicity());
    }
}
