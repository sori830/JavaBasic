package test06;

public class Cone extends Circle {
    private double height;

    public Cone(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double findArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return 3.14 * radius * (radius + slantHeight);
    }

    @Override
    public double findRadius() {
        return super.findRadius();
    }
}
