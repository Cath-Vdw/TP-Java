package TP6bis;

public class CurrentAccount extends Account {
    private float treshold;         // treshold under which the balance can't go

    // Constructor
    public CurrentAccount(String number, float balance, float treshold){
        super(number, balance);
        this.treshold = treshold;
    }

    // Remove money from the account but only if it's above 0
    @Override
    public void debit(float amount) {
        if ((getBalance() - amount) >= treshold) {
            super.debit(amount);
            displayBalance();
        } else {
            System.out.println("Transaction impossible");
        }
    }
}
