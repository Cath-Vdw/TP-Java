package TP1;

import java.util.Scanner;

// Afficher le plus grand de deux nombres entiers
public class Exo06 {
    public static void main(String[] args) {
        int nb1, nb2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre entier: ");
        nb1 = sc.nextInt();
        System.out.println("Entrez un second nombre entier: ");
        nb2 = sc.nextInt();
        int bigger = (nb1 > nb2) ? nb1 : nb2;
        System.out.printf("Le plus grand des deux nombres encodés est %d ", bigger);
        sc.close();
    }
}