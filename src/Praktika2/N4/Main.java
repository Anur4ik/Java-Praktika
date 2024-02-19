package Praktika2.N4;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(4000);
        HRManager mgr = new HRManager(10000);

        emp.work();
        System.out.println("Зарплата Працівника " + emp.getSalary());

        mgr.work();
        System.out.println("Зарплата Менджера " + mgr.getSalary());
        mgr.addEmployee();
    }
}
