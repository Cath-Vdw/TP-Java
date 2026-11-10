package TP6;

public class Book extends Resource {
    // Private attribute
    private String genre;       // add another attribute to the ones from the parent Class

    // Constructor
    public Book(String title, String author, String genre){
        super(title, author);   // inherit the same constructor as Resource
        this.genre = genre;
    }

    // Getter
    public String getGenre(){
        return genre;
    }

    // Setter
    public void setGenre(String genre){
        this.genre = genre;
    }

    // Override display to include the new attribute
    @Override
    public void display(){
        System.out.printf("%s - %s (%s)%n", getAuthor(), getTitle(), getGenre());
    }

}
