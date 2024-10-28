/**
 * [예제 4-3 : 두 개의 생성자를 가진 Circle 클래스]
 * - 생성자 = 메소드
 * - 생성자의 이름 = 클래스 이름
 * - 여러 개 작성 가능 (오버로딩)
 * - 리턴 타입 지정 불가능
 * - 생성자의 목적은 "객체 초기화"
 * - 객체 생성 시 반드시 호출
 */

package examples;

public class Circle2 {
    int radius;
    String name;

    public Circle2() { // 매개 변수 없는 생성자 (생성자의 이름은 클래스의 이름과 동일!)
        radius = 1; name = ""; // radius의 초기값은 1
    }
    public Circle2(int r, String n) { // 매개 변수를 가진 생성자 (생성자는 리턴 타입 X)
        radius = r; name = n;
    }
    public double getArea() {
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Circle2 pizza = new Circle2(10, "자바피자"); // Circle 객체 생성, 반지름 10
        // -> 매개 변수가 있으므로 "매개 변수를 가진 생성자"가 초기화

        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle donut = new Circle(); // Circle 객체 생성, 반지름 1
        // -> 매개 변수가 없으므로 "매개 변수가 없는 생성자"가 초기화
        donut.name = "도넛피자";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
