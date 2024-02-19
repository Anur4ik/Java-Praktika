package Praktika2.N5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Баланс $500:");
        BankAccount account= new BankAccount(500);
        System.out.println("Поповнення 1000 на акаунт ");
        account.deposit(1000);
        SavingsAccount with=new SavingsAccount(account.balance);
        System.out.println("Зняття з карти ");
       with.withdraw(5000);

    }}

