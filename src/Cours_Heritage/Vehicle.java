package Cours_Heritage;

public class Vehicle {
    // Attributes
    private String registration;
    protected double dailyFee;

    // Constructor
    public Vehicle(String registration, double dailyFee) {
        this.registration = registration;
        this.dailyFee = dailyFee;
    }

    // Getters
    public String getRegistration() {
        return registration;
    }

    // Given a number of days, returns a fee
    public double calculateFee(int days) {
        return days * dailyFee;
    }
}
