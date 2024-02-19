package Praktika2.N8;

public class Circle extends Shape {

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }


    public double  getPerimeter() {
       return  2 * Math.PI * radius;
    }


    public double getArea() {
        return Math.PI * radius * radius;
    }
}
