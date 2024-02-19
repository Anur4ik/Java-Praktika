package Praktika2.N4;

public class Employee {
   int salary;
    public Employee(int salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Працівник Працює");
    }

    public int getSalary() {
        return salary;
    }
}
