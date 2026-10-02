package TP2;

public class Exo4 {
    // Décompte des secondes de 0 à 3 minutes
    public static void main(String[] args) {
        for (int i = 0; i < 181; i++) {
            if(i%60<10){
                System.out.println(i/60+ " minute(s) 0" + i%60 + " seconde(s)");
            } else System.out.println(i/60+ " minute(s) " + i%60 + " seconde(s)");
        }
    }
}
