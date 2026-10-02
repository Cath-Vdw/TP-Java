package TP1;

import java.util.Scanner;

// Surface d'un triangle
public class Exo01 {
    public static void main(String[] args) {
        double base, hauteur, surface;
        Scanner sc = new Scanner(System.in);
        System.out.println("La base du triangle est :");
        base = sc.nextDouble();
        System.out.println("La hauteur du triangle est :");
        hauteur = sc.nextDouble();
        surface = base * hauteur / 2;
        System.out.printf("La surface du triangle est : %2f", surface);
        // %d pour entier, %f pour décimales
        sc.close();
        // prendre l'habitude de fermer le scanner
    }
}