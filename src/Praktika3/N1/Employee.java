package Praktika3.N1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee extends Worker{
    public LocalDate hireDate;
    public long employeeId= 40;
    public Employee(String name, String birthDate, String endDate) {
        super(name, birthDate, endDate);
    }
    @Override
    int getAge(){
        LocalDate currentDate = LocalDate.now();
        int now_year=currentDate.getYear();
        int Age=now_year-Integer.parseInt(bithDate.substring(6,10));
        return Age;
    }
    public double collectPay() {
        return employeeId;
    }
}
