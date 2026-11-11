package TP7;

import java.util.*;

public class Verbe {
    // Attribut(s)
    private String verbe;

    // Constructeur
    public Verbe() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Entrez un verbe du premier groupe (se terminant par -er)");
            this.verbe = sc.nextLine();
        } while (this.verbe.length() < 3 || !(this.verbe.toLowerCase().charAt(this.verbe.length() - 2) == 'e') || !(this.verbe.toLowerCase().charAt(this.verbe.length() - 1) == 'r'));
    }

    // Accesseur/getter
    public String getVerbe() {
        return verbe;
    }
}
