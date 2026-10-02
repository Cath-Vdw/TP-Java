package TP2;

import java.util.Scanner;

// Carré d'étoiles
public class Exo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Combien d'étoiles voulez-vous par côté?");
        byte sides = sc.nextByte();
        for (int i = 0; i < sides; i++) {
            for (int j = 0; j < sides; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
