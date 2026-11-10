package Cours_Heritage;

public class Manager extends Employee{
    // Private attribute
    private double fixedBonus;

    // Constructor
    public Manager(String name, String matricule, double salary, double fixedBonus){
        super(name, matricule, salary);
        this.fixedBonus = fixedBonus;
    }

    // Getter
    public double getFixedBonus() {
        return fixedBonus;
    }

    // Override salary
    @Override
    public double calculateSalary(){
        return getSalary() + fixedBonus;
    }

    // Override displayInfos
    @Override
    public void displayInfos(){
        System.out.printf("%s (%s) - basis salary: %.2f €, fixed bonus %.2f € -> total salary: %.2f €%n", getName(), getMatricule(), getSalary(), getFixedBonus(), calculateSalary());
    }



}
