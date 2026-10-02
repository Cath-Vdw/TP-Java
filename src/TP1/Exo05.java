package TP1;

import java.util.Scanner;

// calculer surface et circonference d'un cercle
public class Exo05 {
    public static void main(String[] args) {
        double rayon;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le rayon du cercle: ");
        rayon = sc.nextDouble();
        double surface = Math.PI * rayon * rayon;
        // surface = Pi R carré - circonférence = 2 Pi R
        // Math est une Class Final (ne peut pas être héritée) et contient un certain nombre d'attributs statiques
        // ne peuvent pas être modifiés - appel NomDeClasse.NomAttribut
        double circonference = 2 * Math.PI * rayon;
        System.out.printf("Rayon = %f - Surface = %f - Circonférence = %f", rayon, surface, circonference);
    }
}