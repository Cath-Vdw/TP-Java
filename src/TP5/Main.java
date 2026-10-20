package TP5;

public class Main {
    public static void main(String[] args) {

        // Tests de la Classe Personne
        Personne paul = new Personne("Paul", 15);
        Personne louise = new Personne("Louise", 18);
        Personne sophie = new Personne("Sophie", 18);
        paul.comparison(sophie);
        louise.comparison(paul);
        sophie.comparison(louise);


        // Tests de la Classe Eleve
        Eleve luc = new Eleve("Luc", 75.5f);
        System.out.println("Luc a-t-il déjà présenté l'examen? " + luc.pourcEntre());
        luc.encoderPourcentage(75.5f);
        Eleve nath = new Eleve("Nathalie");
        System.out.println("Nathalie a-t-elle déjà présenté l'examen? " + nath.pourcEntre());
        nath.encoderPourcentage(82.7f);
        System.out.println("Nathalie a-t-elle déjà présenté l'examen? " + nath.pourcEntre());


        // Tests de la Classe Facture
        new Facture("Caleb Widowgast", 120.00);   // moyenne Widowgast = 120.00 €
        new Facture("Caleb Widowgast", 80.00);    // moyenne Widowgast = 100.00 €
        new Facture("Jester Lavorre", 50.00);    // moyenne Lavorre = 50,00 €
        new Facture("Caleb Widowgast", 70.00);    // moyenne Widowgast = 90,00 €


        // Tests de la Classe Lotto
        // Tableau 'grille' initialisé avec 6 constantes (numéros cochés par le joueur)
        final int[] grille = {5, 18, 19, 27, 33, 44};

        // Affichage du contenu de 'grille'
        System.out.print("Grille du joueur : ");
        for (int i = 0; i < grille.length; i++) {
            System.out.print(grille[i] + " ");
        }
        System.out.println();

        // Instanciation de la combinaison gagnante
        Lotto gagnant = new Lotto();

        // Comptage des bons numéros
        int bonsNumeros = 0;
        for (int i = 0; i < grille.length; i++) {
            if (gagnant.numGagnant(grille[i])) {
                bonsNumeros++;
            }
        }

        // Affichage du résultat
        if (bonsNumeros <= 2) {
            System.out.println("PERDU");
        } else {
            System.out.println("GAGNE AVEC " + bonsNumeros + " BONS NUMÉROS");
        }

        // Affichage de la combinaison gagnante pour vérification
        gagnant.afficheNuméros();
    }
}

