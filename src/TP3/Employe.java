package TP3;

/**
 * Classe qui représente un employé
 */
public class Employe {

    // Attributs privés
    private String nom;           // nom de l'employé
    private boolean acompte;      // true si l'acompte a déjà été versé
    private int nbHeures;         // nombre d'heures prestées
    private float salaireHoraire; // salaire pour 1 heure de travail

    // Initialise nom et salaireHoraire, met nbHeures à 0 et acompte à false
    public void initialise(String nom, float salaireHoraire) {
        this.nom = nom;
        this.salaireHoraire = salaireHoraire;
        this.nbHeures = 0;
        this.acompte = false;
    }

    // Verse un acompte de 500 € si aucun acompte n'a encore été versé ce mois-ci
    public void demandeAcompte() {
        if (!acompte) {
            // Pas encore d'acompte : on le verse et on positionne le booléen à true
            System.out.println("Ok, " + nom + ", on vous verse 500 €...");
            acompte = true;
        } else {
            // Acompte déjà versé : on refuse (maximum un acompte par mois)
            System.out.println("Désolé, " + nom + ", un seul acompte par mois !!!");
        }
    }

    // Ajoute le nombre d'heures reçu en paramètre à nbHeures,
    // puis affiche le total d'heures du mois
    public void travaille(int heures) {
        nbHeures = nbHeures + heures;
        System.out.println(nom + " : " + nbHeures + " heures ce mois-ci");
    }

    // Renvoie le salaire à percevoir :
    // nbHeures * salaireHoraire, moins 500 si l'acompte a déjà été versé
    public float salaire() {
        float s = nbHeures * salaireHoraire;
        if (acompte) {
            s = s - 500;
        }
        return s;
    }
}
