package test06;

public class Circle { // super class
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double findRadius() {
        return radius;
    }

    public double findArea() {
        return 3.14 * radius * radius;
    }

    void draw() {
        System.out.println("Circle");
    }
}
