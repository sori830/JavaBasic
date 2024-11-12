/*
    예제 5-3 : super()를 활용한 ColorPoint 작성
    super()을 이용하여 ColorPoint 클래스의 생성자에서 슈퍼 클래스 Point의 생성자를 호출하기
 */

package examples;

class Point1 {
    private int x, y;

    public Point1() {
        this.x = this.y = 0;
    }

    public Point1(int x, int y) {
        this.x = x; this.y = y;
    }

    public void showPoint() { // 점의 좌표를 출력하는 메소드
        System.out.println("(" + x + "," + y + ")");
    }
}

class ColorPoint1 extends Point1 {
    private String color; // 점의 색

    public ColorPoint1(int x, int y, String color) {
        super(x, y); // Point의 생성자 Point(x, y) 호출
        this.color = color;
    }

    public void showColorPoint() { // 컬러 점의 좌표 출력
        System.out.print(color);
        showPoint(); // Point 클래스의 showPoint() 호출
    }
}

public class SuperEx {
    public static void main(String[] args) {
        ColorPoint1 cp1 = new ColorPoint1(5, 6, "blue");
        cp1.showColorPoint();
    }
}
