package Cours_Heritage;

import TP3.Employe;

public class Main {
    public static void main(String[] args) {
        Employee alice = new Employee("Alice", "EMP-101", 2500);
        alice.displayInfos();
        Employee bob =new Manager("Bob", "MNG-201", 3500, 800);
        bob.displayInfos();
    }
}
