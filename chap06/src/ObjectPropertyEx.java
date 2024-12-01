/*
    예제 6-1 : Object 클래스로 객체 속성 알아내기
    - 객체 레퍼런스만으로 객체의 클래스명, 해시코드 값, 객체의 문자열을 출력하는 프로그램
 */

class _01_Point {
    private int x, y;
    public _01_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class ObjectPropertyEx {
    public static void print(Object obj) {
        // Class getClass() : 현 객체의 런타임 클래스를 리턴
        System.out.println("현 객체의 런타임 클래스 : " + obj.getClass().getName());

        // int hashCode() : 현 객체에 대한 해시 코드 값 리턴
        System.out.println("현 객체에 대한 해시 코드 값 : " + obj.hashCode());

        // String toString() : 현 객체에 대한 문자열 표현을 리턴
        System.out.println("현 객체에 대한 문자열 표현 : " + obj.toString());

        // 객체 출력
        System.out.println("객체 출력 : " + obj);
    }
    public static void main(String[] args) {
        _01_Point p = new _01_Point(2,3);
        print(p);
    }
}
