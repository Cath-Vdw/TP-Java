package Cours5_Array_list;

public class Book {
    // Attributs privés
    private String title;
    private String author;
    private boolean isTaken;

    // Constructeur
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public boolean isTaken() {
        return isTaken;
    }

    // Méthodes
    public void borrowBook(){
        if(!isTaken) isTaken = true;
        System.out.println("The book " + title + " has been borrowed.");
    }

    public void returnBook(){
        if(isTaken) isTaken = false;
        System.out.println("The book " + title + " has been returned.");
    }

    public String describe() {
        String status = isTaken ? "borrowed" : "available";
        return author + " - " + title + " (" + status + ")";
    }

}
