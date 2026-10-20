package TP5;

/**
 * * Notions de POO
 * – Encapsulation : attributs privés, accès contrôlé par des méthodes publiques.
 * – Surcharge de constructeurs : deux constructeurs avec des paramètres différents.
 * – Setter : méthode qui modifie un attribut, ici avec un contrôle.
 */
public class Eleve {
    // Attributs privés
    private String nom;
    private Float pourcentage;

    // Constructeur 1
    public Eleve(String nom, Float pourcentage) {
        this.nom = nom;
        this.pourcentage = pourcentage;
    }

    // Constructeur 2 (surcharge, avec un argument de moins)
    public Eleve(String nom) {
        this.nom = nom;
        this.pourcentage = null;
    }

    // Setter
    public void setPourcentage(Float pourcentage) {
        this.pourcentage = pourcentage;
    }

    // Méthode testant si le Pourcentage est encodé ou non
    public void encoderPourcentage(float pourcentage) {
        if (pourcEntre()) System.out.println("Erreur, le pourcentage de " + this.nom + " est déjà encodé!");
        else setPourcentage(pourcentage);
    }

    // Méthodes avec retour
    // Renvoie true si l'élève a un pourcentage encodé
    public boolean pourcEntre() {
        return pourcentage != null;
    }




}
