package TP1;

import java.util.Scanner;

// Nombre pair ou impair
public class Exo03 {
    public static void main(String[] args) {
        int nb;
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre um nombre entier: ");
        nb = sc.nextInt();
        // condition ternaire
        String result = (nb % 2 == 0) ? "Nombre pair" : "Nombre impair";
        System.out.println(result);
        sc.close();
    }
}