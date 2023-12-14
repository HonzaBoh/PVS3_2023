package oop.references;

public class BankAccount {
    double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(500);
        BankAccount account3 = new BankAccount(200);

        account1.deposit(300);
        account2.withdraw(100);
        account3.deposit(50);

        BankAccount temp = account1;
        account1 = account2;
        account2 = account3;
        account3 = temp;

        account1.withdraw(150);
        account2.deposit(200);
        account3.withdraw(50);

        System.out.println("Account 1 Balance: $" + account1.balance);
        System.out.println("Account 2 Balance: $" + account2.balance);
        System.out.println("Account 3 Balance: $" + account3.balance);
    }
}
