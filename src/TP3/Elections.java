package TP3;

/**
 * Classe qui gère des élections à 4 candidats
 * Un candidat qui obtient plus de 50 % des suffrages est élu dès le 1er tour.
 * Si personne n'est élu, seuls les candidats ayant au moins 12,5 % des voix peuvent participer au 2e tour.
 */
public class Elections {

    // Attributs privés : pourcentage de voix de chaque candidat au 1er tour
    private float a; // candidat 1
    private float b; // candidat 2
    private float c; // candidat 3
    private float d; // candidat 4

    // Initialise les attributs avec les pourcentages des 4 candidats au 1er tour
    public void initialise(float a, float b, float c, float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    /**
     * Renvoie les résultats du premier candidat uniquement
     * "ÉLU", "BATTU" ou "EN BALLOTTAGE"
     */
    public String resultatCandidat1() {
        // Cas 1) Le candidat 1 a plus de 50 % et est élu au 1er tour.
        if (a > 50) {
            return "ÉLU";
        }

        // Cas 2a) Un autre candidat a plus de 50 % et est élu.
        // Cas 2b) Personne n'est élu, mais le candidat 1 a moins de 12,5 %.
        // Le candidat 1 est battu.
        if (b > 50 || c > 50 || d > 50 || a < 12.5) {
            return "BATTU";
        }

        // Cas 3) Personne n'est élu et le candidat 1 a au moins 12,5 % : ballottage
        return "EN BALLOTTAGE";
    }

    /**
     * Affiche S'il y a un second tour
     * Et le nombre de candidats qui y participent
     */
    public void afficheTour2() {
        // Tableau local regroupant les pourcentages des 4 candidats
        float[] scores = {a, b, c, d};

        // Une seule boucle qui permet de vérifier si un candidat a plus de 50 %
        // et de compter les candidats ayant au moins 12,5 %
        boolean elu = false;
        int n = 0;
        for (int i = 0; i < scores.length; i++) {
            // Si un candidat a plus de 50 %, il est élu.
            // Pas de 2e tour, la boucle s'arrête.
            if (scores[i] > 50) {
                elu = true;
                break;
            }
            // Sinon, on compte si le candidat pourrait participer au second tour.
            if (scores[i] >= 12.5) {
                n++;
            }
        }

        if (elu) {
            System.out.println("PAS DE DEUXIÈME TOUR");
        } else {
            System.out.println(n + " CANDIDATS AU DEUXIÈME TOUR");
        }
    }
}

