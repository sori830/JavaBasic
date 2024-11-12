/*
    예제 5-5 : 메소드 오버라이딩으로 다형성 실현
 */
package examples;

class Shape { // 슈퍼 클래스
    public Shape next; // 현재 객체와 다음 Shape 객체를 연결할 때 사용하는 용도
    public Shape() { next = null; } // Shape의 생성자 -> next null로 초기화

    public void draw() {
        System.out.println("Shape");
    }
}

class Line extends Shape {
    public void draw() { // 메소드 오버라이딩
        System.out.println("Line");
    }
}

class Rect extends Shape {
    public void draw() { // 메소드 오버라이딩
        System.out.println("Rect");
    }
}

class Circle extends Shape {
    public void draw() { // 메소드 오버라이딩
        System.out.println("Circle");
    }
}

public class MethodOverridingEx {
    static void paint(Shape p) {
        p.draw(); // p가 가리키는 객체 내에 오버라이딩 된 draw() 호출. 동적 바인딩!
    }

    public static void main(String[] args) {
        Line line = new Line();
        paint(line);
        paint(new Shape());
        paint(new Line());
        paint(new Rect());
        paint(new Circle());
    }
}
