package TP1;

import java.util.Scanner;

// Calculer l'heure qu'il sera dans une minute
public class Exo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer l'heure (entre 0 et 23): ");
        int h = sc.nextInt();
        System.out.println("Veuillez entrer le nombre de minutes: ");
        int min = sc.nextInt();
        int totalMinutes = h * 60 + min + 1;
        int nouvelleH = (totalMinutes / 60) % 24;
        int resteMin = totalMinutes % 60;
        String result = (resteMin == 0) ? nouvelleH + "h00" : nouvelleH + "h" + resteMin;
        System.out.println(result);
        sc.close();
    }
}