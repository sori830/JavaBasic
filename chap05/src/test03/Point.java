package test03;

import org.w3c.dom.ls.LSOutput;

class Point {
    private int x,y;
    public Point() {
        this.x = this.y = 0;
    }
    public Point(int x, int y) {
        this.x = x; this.y = y;
    }
    public void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
}
