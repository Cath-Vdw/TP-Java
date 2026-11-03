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
        System.out.println("Le livre " + title + " a bien été emprunté.");
    }

    public void returnBook(){
        if(isTaken) isTaken = false;
        System.out.println("Le livre " + title + " a bien été rendu.");
    }

   public void describe(){
       System.out.println(author + " - " + title);
   }


}
