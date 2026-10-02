package TP1;

import java.util.Scanner;

// Conversion des secondes en minutes/secondes
public class Exo02 {
    public static void main(String[] args) {
        System.out.println("Introduisez le nombre de secondes: ");
        Scanner sc = new Scanner(System.in);
        int secondes = sc.nextInt();
        int minutes = secondes / 60;
        int secondesRest = secondes % 60;
        System.out.printf("Minutes: %d - Secondes: %d", minutes, secondesRest);
        sc.close();
    }
}