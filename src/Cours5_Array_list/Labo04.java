package Cours5_Array_list;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Gestionnaire de tâches
 *  1. Menu : 1 Ajouter / 2 Afficher / 3 Supprimer / 4 Rechercher / 0 Quitter
 *  2. Ajouter une tache non vide
 *  3. Afficher avec une numérotation commençant a 1
 *  4. Supprimer par numero (penser à retirer 1 pour l'indice Java)
 *  5. Rechercher sans tenir compte de la casse
 *  6. Gérer la liste vide et les choix invalides
 */
public class Labo04 {

    // Méthode qui affiche le menu
    private static void displayMenu() {
        System.out.println();
        System.out.println("=== GESTIONNAIRE DE TACHES ===");
        System.out.println("1 Ajouter");
        System.out.println("2 Afficher");
        System.out.println("3 Supprimer");
        System.out.println("4 Rechercher");
        System.out.println("0 Quitter");
        System.out.print("Votre choix : ");
    }

    private static void addTask(ArrayList<String> tasks, Scanner sc) {
        System.out.print("Nouvelle tâche : ");
        String task = sc.nextLine().trim();

        // Quitte la méthode si on tape sur enter par accident au lieu d'encoder la tâche
        if (task.isEmpty()) {
            System.out.println("La tâche ne peut pas être vide.");
            return;
        }

        tasks.add(task);
        System.out.println("Tâche ajoutée : " + task);
    }

    // Affiche le contenu de l'ArrayList tasks
    private static void displayTasks(ArrayList<String> tasks) {
        // Quitte la méthode si la liste est vide
        if (tasks.isEmpty()) {
            System.out.println("Aucune tâche enregistrée");
            return;
        }

        // Affiche les tâches, numérotées de 1 à n
        System.out.println("Liste des tasks (" + tasks.size() + ") :");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + " - " + tasks.get(i));
        }
    }

    // Supprimer un élément sur base de son indice dans la liste
    private static void deleteTask(ArrayList<String> tasks, Scanner sc) {
        // Quitte la méthode si la liste est vide
        if (tasks.isEmpty()) {
            System.out.println("Aucune tâche à supprimer");
            return;
        }

        displayTasks(tasks); //
        System.out.print("Numéro de la tâche à supprimer : ");
        String taskNumber = sc.nextLine();

        int number;
        try {
            number = Integer.parseInt(taskNumber.trim()); // nextline renvoie une String, donc changer en numéro
        } catch (NumberFormatException e) { // Si ce qu'on tape n'est pas un numéro
            System.out.println("Numéro invalide");
            return;
        }

        int index = number - 1; // Indice commence à 0
        if (index < 0 || index >= tasks.size()) { // Vérifie que le numéro encodé correspond bien à un élément de la liste
            System.out.println("Numéro invalide");
            return;
        }

        String deleted = tasks.remove(index); // Enregistre la tâche supprimée dans une variable locale
        System.out.println("Tâche supprimée : " + deleted); // pour pouvoir l'afficher ensuite
    }

    // Rechercher une tâche sur base d'un mot-clé
    private static void rechercherTache(ArrayList<String> tasks, Scanner sc) {
        if (tasks.isEmpty()) {
            System.out.println("Aucune tâche enregistrée.");
            return;
        }

        System.out.print("Mot à rechercher : ");
        String searchedWord = sc.nextLine().trim().toLowerCase(); // Met tout en lowercase pour avoir un match exact

        // Quitte la méthode si on tape sur enter par accident au lieu d'encoder le mot-clé
        if (searchedWord.isEmpty()) {
            System.out.println("Recherche vide");
            return;
        }

        int found = 0;
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).toLowerCase().contains(searchedWord)) {
                System.out.println((i + 1) + " - " + tasks.get(i));
                found++;
            }
        }

        if (found == 0) {
            System.out.println("Aucune tâche ne contient : " + searchedWord);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> taches = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean actif = true;

        while (actif) {
            displayMenu();
            String choix = sc.nextLine();

            switch (choix) {
                case "1":
                    addTask(taches, sc);
                    break;
                case "2":
                    displayTasks(taches);
                    break;
                case "3":
                    deleteTask(taches, sc);
                    break;
                case "4":
                    rechercherTache(taches, sc);
                    break;
                case "0":
                    actif = false;
                    System.out.println("Au revoir!");
                    break;
                default:
                    System.out.println("Choix invalide");
            }
        }

        sc.close();
    }
}
