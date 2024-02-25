package Praktika3.N1;

public class SalariedEmployee extends Employee{
    public double annualSalary;
    public boolean isRetired;
    public SalariedEmployee(String name, String birthDate, String endDate, double annualSalary) {

        super(name, birthDate, endDate);
        this.annualSalary = annualSalary;
        this.isRetired = false;
    }
    public void retire() {
        isRetired = true;
        System.out.println(name + " is retired");
    }

    // Method to collect pay
    @Override
    public double collectPay() {
        if(isRetired) {
            return annualSalary * 0.9 ;
        }
        else{
            return annualSalary / 24;
        }
    }
}
