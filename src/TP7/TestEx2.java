package TP7;

public class TestEx2 {
    public static void main(String[] args) {
        Dico dico = new Dico();
        System.out.println("trad rose: " + dico.tradAngl("rose"));
        System.out.println("trad blue: " + dico.tradFr("blue"));
        dico.ajouteMot("rose", "pink");
        System.out.println("trad rose: " + dico.tradAngl("rose"));
        System.out.println("trad pink: " + dico.tradFr("pink"));
    }
}
