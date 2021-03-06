package org.xpdojo.bank;

public class Account {

    private int balance = 0;

    public int balance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    };

    public void withdraw(int amount) {
        balance -= amount;
    };

    public void transfer(int amount, Account transferTo) {
        if (amount <= balance) {
            balance -= amount;
            transferTo.deposit(amount);
        }
    };

    public String printSlip() {
        return "Your balance is ".concat(String.valueOf(10));
    };
}
