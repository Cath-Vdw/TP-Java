package TP1;

import java.util.Scanner;

// Affiche le plus grand de deux nombres entiers en utilisant Math.max()
public class Exo07 {
    public static void main(String[] args) {
        int nb1, nb2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre entier: ");
        nb1 = sc.nextInt();
        System.out.println("Entrez un second nombre entier: ");
        nb2 = sc.nextInt();
        int bigger = Math.max(nb1, nb2);
        System.out.printf("Le plus grand des deux nombres encodés est %d ", bigger);
        sc.close();
    }
}