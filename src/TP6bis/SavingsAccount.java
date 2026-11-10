package TP6bis;

public class SavingsAccount extends Account{
    // private attributes
    private float treshold;         // treshold under which the balance can't go

    // Constructor
    public SavingsAccount(String number, float balance){
        super(number, balance);
        interestRate = 2.5f;
    }

    // Remove money from the account but only if it's above the treshold
    @Override
    public void debit(float amount) {
        if ((getBalance() - amount) >= 0) {
            super.debit(amount);
            displayBalance();
        } else {
            System.out.println("Transaction impossible");
        }
    }

}
