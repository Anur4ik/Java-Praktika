package Praktika2.N5;

public class SavingsAccount extends BankAccount {

    public SavingsAccount( double balance) {
        super(balance);
    }

    public void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Мінімальний баланс 100 грн");
        } else {
            super.withdraw(amount);
        }
    }
}
