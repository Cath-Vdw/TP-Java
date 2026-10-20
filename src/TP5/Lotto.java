package TP5;

/**
 * * Notions de POO
 * – Encapsulation : le tableau tab est privé, on le consulte via des méthodes publiques.
 * – Constructeur sans paramètre : remplit lui-même le tableau.
 * – Méthodes d'instance : numGagnant() et afficheNuméros().
 */
public class Lotto {

    // Attribut privé : les 6 numéros de la combinaison gagnante
    private int[] tab;

    // Constructeur : initialise le tableau avec les 6 numéros de la combinaison gagnante
    public Lotto() {
        tab = new int[]{5, 12, 19, 22, 38, 44};
    }

    // Méthode qui renvoie true si le numero est gagnant, false sinon
    public boolean numGagnant(int numero) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == numero) {
                return true;
            }
        }
        return false;
    }

    // Méthode qui affiche les numéros gagnants pour vérification
    public void afficheNuméros() {
        System.out.print("Combinaison gagnante : ");
        for (int j = 0; j < tab.length; j++) {
            System.out.print(tab[j] + " ");
        }
        System.out.println();
    }
}
