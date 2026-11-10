package TP6bis;

public class Account {
    // Private attributes
    private String number;
    private float balance;
    protected double interestRate;

    // Constructor
    public Account(String number, float balance) {
        this.number = number;
        this.balance = balance;
        this.interestRate = 1;
    }

    // Getters
    public String getNumber() {
        return number;
    }

    public float getBalance(){
        return balance;
    }


    // Display the balance of the account
    public void displayBalance() {
        System.out.printf("Balance of the account: %.2f €%n", balance);
    }

    // Add money to the account
    public void credit(float amount) {
        balance += amount;
        displayBalance();
    }

    // Remove money from the account
    public void debit(float amount) {
        balance -= amount;
        displayBalance();
    }

    // Calculate the interest rate
    public double getInterestRate() {
        return (balance * interestRate) / 100;
    }
}
