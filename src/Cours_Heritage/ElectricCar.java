package Cours_Heritage;

public class ElectricCar extends Vehicle {
    // Private attribute
    private int autonomyKm;

    // Constructor
    public ElectricCar(String registration, double dailyFee, int autonomyKm) {
        super(registration, dailyFee);
        this.autonomyKm = autonomyKm;
    }

    @Override
    public double calculateFee(int days) {
        return super.calculateFee(days) * 0.9; // remove 10%
    }
}
