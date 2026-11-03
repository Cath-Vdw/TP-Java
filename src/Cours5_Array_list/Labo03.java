package Cours5_Array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Labo03 {
    public static void main(String[] args) {
        ArrayList<Integer> stocks = new ArrayList<>(List.of(15, 0, 8, 0, 12, 3));
        System.out.println("Départ: " + stocks);
        int count = 0;
        for (int item : stocks) if (item == 0) count++;
        System.out.println("Nombre de valeurs nulles : " + count);
        stocks.removeIf(stock -> stock == 0);
//        stocks.set(1, 7);
        stocks.set(stocks.indexOf(8), 10);
        Collections.sort(stocks);
        System.out.println("Arrivée: " + stocks);
    }
}
