package Praktika3.N1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Worker {
    public String name;
    public String bithDate;
    public String endDate;

    public Worker(String name, String bithDate, String endDate) {
        this.name = name;
        this.bithDate = bithDate;
        this.endDate = endDate;
    }

    int getAge(){
     LocalDate currentDate = LocalDate.now();
      int now_year=currentDate.getYear();
    int Age=now_year-Integer.parseInt(bithDate.substring(6,10));
       return Age;
    }
    public String toString() {
        return "Name: " + name;
    }
     double  collectPay(){return 40;}
}
