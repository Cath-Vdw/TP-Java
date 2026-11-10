package Cours_Heritage;

public class Employee {
    // Private attributes
    private String name;
    private String matricule;
    private double salary;

    // Constructor
    public Employee(String name, String matricule, double salary) {
        this.name = name;
        this.matricule = matricule;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getMatricule() {
        return matricule;
    }

    public double getSalary() {
        return salary;
    }

    // Method that returns the basisSalary
    public double calculateSalary(){
        return salary;
    }

    // Display info
    public void displayInfos(){
        System.out.printf("%s (%s) - basis salary: %.2f € -> total salary: %.2f €%n", name, matricule, salary, calculateSalary());
    }
}
