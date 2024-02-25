package Praktika3.N1;

public class HourlyEmployee extends Employee {
    private double hourlyRate;
    public HourlyEmployee(String name, String birthDate, String endDate, double hourlyRate) {
        super(name, birthDate, endDate);
        this.hourlyRate = hourlyRate;
    }
    public double getDoublePay() {
        return hourlyRate * 6;
    }
    public double collectPay() {
        return hourlyRate * 25;
    }
}
