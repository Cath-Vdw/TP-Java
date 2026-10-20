package TP5;

/**
 * Notions de POO
 * – Classe : modèle qui décrit les attributs et les méthodes d'une personne.
 * – Encapsulation : les attributs sont private et on y accède via des méthodes publiques.
 */
public class Personne {

    // Attributs privés (encapsulation)
    private String nom;
    private int age;

    // Constructeur
    public Personne(String name, int age) {
        this.nom = name;
        this.age = age;
    }

    // Méthode d'instance permettant de comparer deux objets Personne
    // Un objet de la même classe est passé en paramètre, on peut donc accéder à ses attributs privés
    public void comparison(Personne other) {
        if (this.age > other.age) System.out.printf("%s est plus âgé.e que %s.\n", this.nom, other.nom);
        else if (this.age < other.age) System.out.printf("%s est plus jeune que %s.\n", this.nom, other.nom);
        else System.out.printf("%s a le même âge que %s.\n", this.nom, other.nom);
    }
}
