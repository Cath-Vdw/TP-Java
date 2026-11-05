package Cours5_Array_list;

import java.util.*;

public class Labo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create 3 books
        Book fTale = new Book("Fairy Tale", "Stephen King");
        Book january = new Book("The Ten Thousands Doors of January", "Alix E. Sterling");
        Book nettle = new Book("Nettle and Bone", "T. Kingfisher");

        // Create an ArrayList with the books
        ArrayList<Book> library = new ArrayList(List.of(fTale, january, nettle));

        // Display the whole catalog
        System.out.println("Available titles: ");
        for (Book book : library) System.out.println(book.describe());

        // Search for a book by its name and borrow it
        System.out.println("Type the title of the book to borrow: ");
        String title = sc.nextLine();
        searchBook(library, title);

        sc.close();
    }

    // Searching a book by its name without distinguishing between uppercase and lowercase letters
    private static void searchBook(ArrayList<Book> library, String searchedTitle) {
        if (library.isEmpty()) {
            System.out.println("Library empty");
            return;
        }

        // Leave the method if the user types enter by accident without typing a title
        if (searchedTitle.isEmpty()) {
            System.out.println("No search typed");
            return;
        }

        for (int i = 0; i < library.size(); i++) {
            Book book = library.get(i);
            if (book.getTitle().equalsIgnoreCase(searchedTitle)) {
                System.out.printf("The book is in the library ");
                if (book.isTaken()) {
                    System.out.printf("but is already borrowed.");
                } else {
                    System.out.printf("and available.");
                    book.borrowBook();
                }
                return;
            }
        }
        System.out.println("No such book in the library");
    }
}


