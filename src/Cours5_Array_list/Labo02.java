package Cours5_Array_list;

import java.util.ArrayList;

public class Labo02 {
    public static void main(String[] args) {
        ArrayList<Integer> notes = new ArrayList<>();
        notes.add(12);
        notes.add(15);
        notes.add(8);
        notes.add(17);
        notes.add(10);
        notes.set(notes.indexOf(8), 11);
        notes.add(14);
        System.out.println(notes);
        System.out.println("Nombre de notes: " + notes.size());
        int sum = 0;
        for (int note : notes) sum += note;
        System.out.println("Somme des notes: " + sum);
        System.out.printf("Moyenne des notes: %.2f\n", (double) sum / notes.size());
        int min = notes.get(0);
        int max = notes.get(0);
        int sup = 0;
        for (int note : notes) {
            if (note < min) min = note;
            if (note > max) max = note;
            if (note>=10) sup++;
        }
        System.out.println("Min: " + min + " - Max : " + max);
        System.out.println("Nombre de notes supérieures ou égales à 10: \n" + sup);
    }
}
