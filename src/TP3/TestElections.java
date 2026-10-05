package TP3;

/**
 * Classe de test de la classe Elections
 */
public class TestElections {

    public static void main(String[] args) {
        // Création d'un objet Elections
        Elections e = new Elections();

        // Cas 1) Le candidat 1 a plus de 50 % et est ELU.
        e.initialise(60, 20, 10, 10);
        System.out.println(e.resultatCandidat1());
        e.afficheTour2();

        // Cas 2) Le candidat 1 est BATTU.
        // Cas 2a : un autre candidat a plus de 50 % (pas de 2e tour)
        e.initialise(20, 60, 10, 10);
        System.out.println("Candidat 1 " + e.resultatCandidat1());
        e.afficheTour2();

        // Cas 2b : personne n'a plus de 50 %, le candidat 1 a moins de 12,5 %
        // -> BATTU, 3 candidats au 2ème tour
        e.initialise(10, 40, 30, 20);
        System.out.println("Candidat 1 " + e.resultatCandidat1());
        e.afficheTour2();

        // Cas 3 : personne n'a plus de 50 %, le candidat 1 a au moins 12,5 %
        // -> EN BALLOTTAGE, 4 candidats au 2e tour
        e.initialise(40, 10, 28, 22);
        System.out.println("Candidat 1 " + e.resultatCandidat1());
        e.afficheTour2();
    }
}