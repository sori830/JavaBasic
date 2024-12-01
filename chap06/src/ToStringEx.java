/*
    예제 6-2 : Point 클래스에 toString() 작성
    - Point 클래스에 Point 객체를 문자열로 리턴하는 toString() 메소드 작성
 */

class _02_Point {
    private int x, y;
    public _02_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // Point 객체를 문자열로 리턴하는 toString() 작성 -> Object의 toString() 오버라이딩
    public String toString() {
        return "Point(" + x + "," + y + ")";
    }
}

public class ToStringEx {
    public static void main(String[] args) {
        _02_Point p = new _02_Point(2,3);
        System.out.println(p.toString());
        System.out.println(p); // p는 toString()으로 자동 변환됨!
        System.out.println(p + "입니다."); // p.toString() + "입니다"로 자동 변환됨!
    }
}
