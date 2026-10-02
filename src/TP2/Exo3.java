package TP2;

import java.util.Scanner;

// Juste prix (trouver un nombre entre 1 et 100 en 8 coups max)
public class Exo3 {
    public static void main(String[] args) {
        byte number = 6;
        byte nbGuess = 8;
        boolean finished = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Essayez de deviner un nombre entre 1 et 100. Vous avez 8 essais:");
        System.out.print("1er essai : ");
        while(!finished){
            byte guess = sc.nextByte();
            System.out.print(guess);
            if(guess == number){
                System.out.println(" Trouvé!");
                finished = true;
            }else{
                --nbGuess;
                if (nbGuess>0){
                    System.out.println((guess>number) ? " - trop grand" : " - trop petit");
                    System.out.print("Entrez un nouveau nombre: ");
                }
                else {
                    System.out.println("Perdu! Le nombre à trouver était "+ number);
                    finished = true;
                }
            }
        }
    }
}
