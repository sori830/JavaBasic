package test06;

public class InheritanceDemo {
    public static void main(String[] args) {
        double radius = 10;
        double height = 15;

        Circle circle = new Circle(radius);
        Ball ball = new Ball(radius);
        Cone cone = new Cone(radius, height);
        Cylinder cylinder = new Cylinder(radius, height);

        System.out.println("Circle의 반지름: " + circle.findRadius());
        System.out.println("Circle의 표면적: " + circle.findArea());

        System.out.println("Ball의 반지름: " + ball.findRadius());
        System.out.println("Ball의 표면적: " + ball.findArea());

        System.out.println("Cone의 반지름: " + cone.findRadius());
        System.out.println("Cone의 표면적: " + cone.findArea());

        System.out.println("Cylinder의 반지름: " + cylinder.findRadius());
        System.out.println("Cylinder의 표면적: " + cylinder.findArea());
    }
}
