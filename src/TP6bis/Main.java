package TP6bis;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Account> myAccounts = new ArrayList<>();
        Account current = new CurrentAccount("333-123-214", 123, -500);
        myAccounts.add(current);
        Account savings = new SavingsAccount("333-123-215", 100);
        myAccounts.add(savings);
        for (Account a :myAccounts) {
            a.debit(100);
            a.credit(200);
            a.getInterestRate();
        }
    }
}
