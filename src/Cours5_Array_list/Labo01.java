package Cours5_Array_list;

import java.util.ArrayList;
import java.util.Collections;

public class Labo01 {

    // Méthode d'affichage
    public static void displayList(ArrayList<String> list) {
        for (String element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> prenoms = new ArrayList<>();
        prenoms.add("Lina");
        prenoms.add("Omar");
        prenoms.add("Sarah");
        prenoms.add("Yassine");
        displayList(prenoms);
        System.out.println("Nombre de prénoms: " + prenoms.size());
        System.out.println("Premier prénom: " + prenoms.get(0));
        System.out.println("Dernier prénom: " + prenoms.get(prenoms.size() - 1));
        prenoms.set(prenoms.indexOf("Omar"), "Adam");
        prenoms.remove("Sarah");
        prenoms.add("Nour");
        Collections.sort(prenoms); // Tri par ordre alphabétique
        displayList(prenoms);
    }
}
