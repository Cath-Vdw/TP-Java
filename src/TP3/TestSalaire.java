package TP3;

/**
 * Classe de test de la classe Employe
 */
public class TestSalaire {

    public static void main(String[] args) {
        // Instancie un objet "cath" de type Employe
        Employe cath = new Employe();

        // L'initialise avec le prénom et un salaire horaire de 55.25 €
        cath.initialise("Cath", 55.25f);

        // Fait travailler 10 heures, puis 8 heures
        cath.travaille(10);
        cath.travaille(8);

        // Affiche le salaire
        System.out.println("Salaire : " + cath.salaire() + " €");

        // Demande un acompte (accepté)
        cath.demandeAcompte();

        // Affiche le salaire (acompte déduit)
        System.out.println("Salaire : " + cath.salaire() + " €");

        // Redemande un acompte (refusé)
        cath.demandeAcompte();

        // Réaffiche une dernière fois le salaire
        System.out.println("Salaire : " + cath.salaire() + " €");
    }
}
