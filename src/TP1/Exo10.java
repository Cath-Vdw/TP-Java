package TP1;

import java.util.Scanner;

// Afficher la catégorie d'une personne en fonction de son âge et son sexe
public class Exo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer votre age: ");
        byte age = sc.nextByte();
        System.out.println("Veuillez entrer votre sexe (true = femme | false = homme)");
        boolean sexe = sc.nextBoolean();
        if (sexe) {
            if (age < 16) {
                System.out.println("Espoir dame");
            } else if (age < 25) {
                System.out.println("Jeune dame");
            } else {
                System.out.println("Aînée");
            }
        } else {
            if (age < 16) {
                System.out.println("Espoir homme");
            } else if (age < 25) {
                System.out.println("Jeune homme");
            } else {
                System.out.println("Vétéran");
            }
        }
        sc.close();
    }
}