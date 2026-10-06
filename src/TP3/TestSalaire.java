package TP3;

/**
 * Classe de test de la classe Employe
 */
public class TestSalaire {

    public static void main(String[] args) {
        // Instancie un objet "cath" de type Employe
        Employe moi = new Employe();

        // L'initialise avec le prénom et un salaire horaire de 55.25 €
        moi.initialise("Cath", 55.25f);

        // Fait travailler 10 heures, puis 8 heures
        moi.travaille(10);
        moi.travaille(8);

        // Affiche le salaire
        System.out.println("Salaire : " + moi.salaire() + " €");

        // Demande un acompte (accepté)
        moi.demandeAcompte();

        // Affiche le salaire (acompte déduit)
        System.out.println("Salaire : " + moi.salaire() + " €");

        // Redemande un acompte (refusé)
        moi.demandeAcompte();

        // Réaffiche une dernière fois le salaire
        System.out.println("Salaire : " + moi.salaire() + " €");
    }
}
