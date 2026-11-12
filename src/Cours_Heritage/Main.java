package Cours_Heritage;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Labo 01
        Employee alice = new Employee("Alice", "EMP-101", 2500);
        alice.displayInfos();
        Employee bob = new Manager("Bob", "MNG-201", 3500, 800);
        bob.displayInfos();

        // Labo 02
        Vehicle truck01 = new Truck("1-ABC-123", 80, 12);
        Vehicle car01 = new ElectricCar("2-DEF-456", 50, 400);
        ArrayList<Vehicle> myCars = new ArrayList<>(List.of(truck01, car01));
        for (Vehicle v : myCars) {
            System.out.println("Registration number: " + v.getRegistration());
            System.out.printf("Total Fee for 3 days: %.2f%n", v.calculateFee(3));
        }
    }
}
