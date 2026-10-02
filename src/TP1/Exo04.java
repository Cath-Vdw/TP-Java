package TP1;

import java.util.Scanner;

// Moyenne de 3 notes
public class Exo04 {
    public static void main(String[] args) {
        float note1, note2, note3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduisez la première note");
        note1 = sc.nextFloat();
        System.out.println("Introduisez la deuxième note:");
        note2 = sc.nextFloat();
        System.out.println("Introduisez la troisième note:");
        note3 = sc.nextFloat();
        float moyenne = (note1 + note2 + note3) / 3;
        System.out.printf("La moyenne est de %2f /20", moyenne);
        int pourcentage = (int) (note1 + note2 + note3) * 5 / 3;
    /*
        int pourcentage1 = (int) note1 * 5;
        int pourcentage2 = (int) note2 * 5;
        int pourcentage3 = (int) note3 * 5;
        int pourcentageMoyen = (int) (note1 + note2 + note3) / 3;
    */
        System.out.printf("La moyenne est de %d %%", pourcentage);
        // double pourcentage affiche le signe %
        sc.close();
    }
}