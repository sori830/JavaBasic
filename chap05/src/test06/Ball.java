package test06;

class Ball extends Circle { // subclass
    public Ball(double radius) {
        super(radius);
    }

    @Override
    public double findArea() {
        return 4 * 3.14 * radius * radius;
    }

    @Override
    public double findRadius() {
        return super.findRadius();
    }

    void draw() {
        System.out.println("Ball");
    }
}
