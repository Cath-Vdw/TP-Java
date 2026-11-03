package Cours5_Array_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Labo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Créer trois livres
        Book fTale = new Book("Fairy Tale", "Stephen King");
        Book january= new Book("The Ten Thousands Doors of January", "Alix E. Sterling");
        Book nettle = new Book("Nettle and Bone", "T. Kingfisher");

        // Créer une ArrayList contenant les livres
        ArrayList<Book> library = new ArrayList(List.of(fTale, january, nettle));

        // Afficher le catalogue complet
        System.out.println("Titres disponibles: ");
        for(Book book : library) book.describe();

        // Chercher un titre par son livre puis l'emprunter
        System.out.println("Encodez le titre du livre à emprunter: ");
        String title = sc.nextLine();
        searchBook(library, title);


    }

    // Méthode pour rechercher un livre par son nom (sans tenir compte de la casse)
    // Rechercher une tâche sur base d'un mot-clé
    private static void searchBook(ArrayList<Book> library, String searchedTitle)  {
        if (library.isEmpty()) {
            System.out.println("Aucun livre dans la bibliothèque");
            return;
        }

        System.out.print("Titre à rechercher : ");
        searchedTitle = searchedTitle.trim().toLowerCase(); // Met tout en lowercase pour avoir un match exact

        // Quitte la méthode si on tape sur enter par accident au lieu d'encoder le titre
        if (searchedTitle.isEmpty()) {
            System.out.println("Recherche vide");
            return;
        }

            for (int i = 0; i < library.size(); i++) {
                if (library.get(i).getTitle().toLowerCase().equals(searchedTitle)) {
                    System.out.println("Le livre se trouve bien dans la bibliothèque.");
                    if (library.get(i).isTaken()) {
                        System.out.println("Il est déjà emprunté.");
                    } else {
                        System.out.println("Il est disponible.");
                        library.get(i).borrowBook();
                    }
                    return;
                }
            }
            System.out.println("Aucun livre trouve avec ce titre");

        }
    }


