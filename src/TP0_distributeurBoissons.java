//Pour pouvoir utiliser le scanner
import java.util.*;

public class TP0_distributeurBoissons {
    public static void main(String[] args) {
        boolean beverageComplete = false;
        // Crée un Scanner sur l'entrée clavier
        Scanner sc = new Scanner(System.in);
        while (!beverageComplete) {
            System.out.println("===== DISTRIBUTEUR DE BOISSONS ======");
            System.out.println("1. Eau : 1.00 €");
            System.out.println("2. Café : 1.50 €");
            System.out.println("3. Thé : 1.50 €");
            System.out.println("4. Chocolat chaud : 2.00 €");
            System.out.println("========================");
            System.out.println("Votre choix: ");
            // Lit le prochain mot saisi par l'utilisateur
            int choix = sc.nextInt();
            double boisson;
            switch (choix) {
                case 1:
                    System.out.print("Eau - ");
                    boisson = 1.0;
                    break;
                case 2:
                    System.out.print("Café - ");
                    boisson = 1.5;
                    break;
                case 3:
                    System.out.print("Thé - ");
                    boisson = 1.5;
                    break;
                case 4:
                    System.out.print("Chocolat chaud - ");
                    boisson = 2.0;
                    break;
                default:
                    System.out.println("Choix invalide");
                    System.out.println("Veuillez choisir un numéro de 1 à 4:");
                    continue;
            }
            System.out.print(boisson + " €\n");
            System.out.println("Veuillez introduire " + boisson + " €");
            double piecettes = sc.nextDouble();
            if (boisson == piecettes) {
                beverageComplete = true;
                System.out.println("Voici votre boisson!");
            } else if (boisson < piecettes) {
                double monnaie = piecettes - boisson;
                beverageComplete = true;
                System.out.println("Voici votre boisson!");
                System.out.println("Voici votre monnaie: " + monnaie + " €");
            } else {
                double reste = boisson - piecettes;
                while (reste > 0) {
                    System.out.println("Il vous manque encore " + reste + " €");
                    piecettes = sc.nextDouble();
                    reste = reste - piecettes;
                }
                beverageComplete = true;
                System.out.println("Voici votre boisson!");
                if (reste < 0) {
                    System.out.println("Voici votre monnaie: " + (-reste) + " €");
                }
            }
        }
    }
}
