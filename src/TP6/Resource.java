package TP6;

public class Resource {
    // Private attributes
    private String title;       // title of the resource
    private String author;      // name of the author

    // Constructor
    public Resource(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    // Print the title and the author
    public void display(){
        System.out.println(author + " - " + title);
    }
}
