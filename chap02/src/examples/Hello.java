package examples;

/** [예제 2-1 자바프로그램 구조]
 * - 클래스 : 객체 지향 언어에서 프로그램을 개발하는 단위
 * - 메서드 : 수행할 작업을 나열한 코드의 모임
 * - 실행문 : 작업을 지시하는 변수 선언, 값 저장, 메서드 호출 등의 코드
 * */

/*
public class examples.Hello { // -> 클래스
    public static void main(String[] args) { // 단축어 : psv -> 메서드
        System.out.println("examples.Hello, Java!"); // 단축어 : sout -> 실행문
    } // 메서드 끝
} // 클래스 끝
*/

// 소스파일 : examples.Hello.java
public class Hello {

    public static int sum(int n, int m) {
        return n + m;
    }

    // main() 메소드에서 실행 시작
    public static void main(String[] args) {
        int i = 20;
        int s;
        char a;

        s = sum(i, 10); // sum() 메소드 호출
        a = '?';
        System.out.println(a); // 문자 '?' 화면에 출력
        System.out.println("examples.Hello"); // "examples.Hello" 문자열 화면에 출력
        System.out.println(s); // 정수 s 값 화면 출력
    }
}
