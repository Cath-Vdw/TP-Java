package TP5;

import java.util.Locale;

/**
 * * Notions de POO
 * – Constructeur : initialise le nom du client et le montant,
 * puis affiche la moyenne des factures de ce client.
 * – Attributs d'instance : propres à chaque facture (nomClient, montant).
 * – Attributs de classe (static) : partagés par toutes les factures.
 * Ils mémorisent, pour chaque client, son nombre de factures et son total.
 * – Tableaux : les attributs de classe sont des tableaux (noms, nbFactures, totaux)
 * qui vont ensemble case par case : la case i concerne le même client.
 */
public class Facture {

    // Attributs d'instance (1 par objet)
    private String nomClient;
    private double montantFacture;

    // Attributs de Classe (un seul exemplaire, partagé par tous les objets)
    // Les 3 tableaux vont ensemble case par case : la case i concerne le même client.
    private static final int MAX_CLIENTS = 20;
    private static String[] noms = new String[MAX_CLIENTS];      // nom de chaque client
    private static int[] nbFactures = new int[MAX_CLIENTS];      // nombre de factures du client
    private static double[] totaux = new double[MAX_CLIENTS];    // total des montants du client
    private static int nbClients = 0;                            // nombre de cases remplies

    // Constructeur: initialise la facture, met à jour les données du client
    // puis affiche le montant moyen des factures de ce client
    public Facture(String nomClient, double montant) {
        this.nomClient = nomClient;
        this.montantFacture = montant;

        // 1. Recherche du client dans le tableau des noms
        int position = -1;   // -1 = client pas encore dans le tableau
        for (int i = 0; i < nbClients; i++) {
            if (noms[i].equals(nomClient)) {
                position = i;
            }
        }

        // 2. Si client pas trouvé : ajout dans la première case libre
        if (position == -1) {
            position = nbClients; // nb de cases remplies et donc première case de libre puisque part de zéro
            noms[position] = nomClient;
            nbClients++;
        }

        // 3. Mise à jour du nombre de factures et du total de ce client
        nbFactures[position]++;
        totaux[position] += montant;

        // 4. Calcul et affichage de la moyenne du client (2 décimales, virgule)
        double moyenne = totaux[position] / nbFactures[position];
        System.out.printf("Montant de la facture en cours pour %s : %.2f €\n", nomClient,  montantFacture);
        System.out.printf("Montant moyen des commandes de %s : %.2f €\n", nomClient, moyenne);
    }
}
