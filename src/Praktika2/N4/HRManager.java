package Praktika2.N4;

public class HRManager extends Employee {


    public HRManager(int salary) {
        super(salary);
    }

    public void work() {
        System.out.println("Меджер Працює");
    }

    public void addEmployee() {
        System.out.println("Додан новий працівник!");
    }
}
