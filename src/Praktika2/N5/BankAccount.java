package Praktika2.N5;

public class BankAccount {
     double balance;

    public BankAccount( double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance+amount;
        System.out.println("Оновлений баланс "+balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance-amount;
            System.out.println("Оновлений баланс "+balance);
        }
        else {
            System.out.println("Не достатньо коштів");
        }
    }


}
