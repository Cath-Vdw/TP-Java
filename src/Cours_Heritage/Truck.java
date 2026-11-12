package Cours_Heritage;

public class Truck extends Vehicle {
    // Private attribute
    private double volumeM3;

    // Constructor
    public Truck(String registration, double dailyFee, double volumeM3) {
        super(registration, dailyFee);
        this.volumeM3 = volumeM3;
    }

    @Override
    public double calculateFee(int days) {
        if (volumeM3 > 10) return super.calculateFee(days) + 20 * days;
        else return super.calculateFee(days);
    }
}
