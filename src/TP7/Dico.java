package TP7;


public class Dico {
    // Attributs privés
    private String[] tabFr;
    private String[] tabAngl;

    // Constructeur
    public Dico() {
        tabFr = new String[]{"bleu", "rouge", "vert", "jaune", "blanc"};
        tabAngl = new String[]{"blue", "red", "green", "yellow", "white"};
    }

    // Traduction anglais-français
    public String tradFr(String word) {
        for (int i = 0; i < tabAngl.length; i++) {
            if (tabAngl[i].equalsIgnoreCase(word)) return tabFr[i];
        }
        return "Mot absent du dico";
    }

    // Traduction français-anglais
    public String tradAngl(String mot) {
        for (int i = 0; i < tabFr.length; i++) {
            if (tabFr[i].equalsIgnoreCase(mot)) return tabAngl[i];
        }
        return "Mot absent du dico";
    }

    // Ajoute un mot et sa traduction aux deux tableaux
    public void ajouteMot(String mot, String word) {
        String[] tabFrCopie = new String[tabFr.length + 1];
        System.arraycopy(tabFr, 0, tabFrCopie, 0, tabFr.length);
        tabFrCopie[tabFr.length] = mot;
        tabFr = tabFrCopie;
        String[] tabAnglCopie = new String[tabAngl.length + 1];
        System.arraycopy(tabAngl, 0, tabAnglCopie, 0, tabAngl.length);
        tabAnglCopie[tabAngl.length] = word;
        tabAngl = tabAnglCopie;
    }


}
