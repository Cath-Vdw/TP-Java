package TP1;

import java.util.Scanner;

// Calculer le résultat d'un candidat au premier tour des élections
public class Exo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le pourcentage obtenu par le 1er candidat: ");
        // système francophone: entrer le nombre avec des virgules
        float candidat1 = sc.nextFloat();
//        System.out.println("Entrez le pourcentage obtenu par le 2e candidat: ");
//        double candidat2 = sc.nextDouble();
//        System.out.println("Entrez le pourcentage obtenu par le 3e candidat: ");
//        double candidat3 = sc.nextDouble();
//        System.out.println("Entrez le pourcentage obtenu par le 1er candidat: ");
//        double candidat4 = sc.nextDouble();

        if (candidat1 > 50)
            System.out.println("Le candidat a été élu avec la majorité.");
        else if (candidat1 < 12.5)
            System.out.println("Le candidat est battu.");
        else System.out.println("Le candidat est en ballottage");
        sc.close();
    }
}