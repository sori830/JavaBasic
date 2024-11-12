package test06;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double findArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double findRadius() {
        return super.findRadius();
    }
}
