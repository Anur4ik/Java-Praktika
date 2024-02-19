package Praktika2.N8;

public class Main {

        public static void main(String[] args) {
            int r = 8;
            Circle c = new Circle(r);
            System.out.println("Радіус="+r);
            System.out.println("Периметр: " + c.getPerimeter());
            System.out.println("Площа " + c.getArea());



        }
}
