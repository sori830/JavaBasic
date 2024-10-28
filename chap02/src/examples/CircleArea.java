/** [예제 2-2 변수, 리터럴, 상수 활용]
 * - 클래스 : 객체 지향 언어에서 프로그램을 개발하는 단위
 * - 메서드 : 수행할 작업을 나열한 코드의 모임
 * - 실행문 : 작업을 지시하는 변수 선언, 값 저장, 메서드 호출 등의 코드
 * */

package examples;

public class CircleArea {
    public static void main(String[] args) {
        final double PI = 3.14; // 원주율을 상수로 선언

        double radius = 10.0; // 원의 반지름
        double circleArea = radius*radius*PI; // 원의 면적 계산

        // 원의 면적을 화면에 출력한다.
        System.out.println("원의 면적 = " + circleArea);
    }
}
