package TP7;

import java.util.ArrayList;
import java.util.List;

public class Conjugaison {
    // Attributs privés
    private static ArrayList<String> pronoms = new ArrayList<>(List.of("Je", "Tu", "Il/Elle", "Nous", "Vous", "Ils/Elles"));
    private static ArrayList<String> suffixes = new ArrayList<>(List.of("e", "es", "e", "ons","ez", "ent"));

    // Méthode de construction des verbes
    public static void affichePresent(String verbe){
        String radical = verbe.substring(0, verbe.length()-2);
        for (int i = 0; i < pronoms.size() ; i++) {
            System.out.printf("%s %s%s%n", pronoms.get(i), radical, suffixes.get(i));
        }
    }
}
