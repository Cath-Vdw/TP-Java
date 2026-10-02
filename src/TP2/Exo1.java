package TP2;

import java.util.Scanner;

// Tables de multiplication
public class Exo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quelle table de multiplication voulez-vous? ");
        int multi = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d", i, multi, i * multi);
            System.out.println("");
        }
        sc.close();
    }
}
