/**
 * [예제 4-2 : Rectangle 클래스 만들기 연습]
 * - 너비와 높이를 입력 받아 사각형의 합을 출력하는 프로그램
 * > 너비와 높이 필드, 면적 값을 제공하는 getArea() 메소드를 가진 Rectangle 클래스를 만들어 활용
 */

package examples;

import java.util.Scanner;

public class Rectangle {
    int width;
    int height;

    public int getArea() {
        return width*height;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(); // 객체 생성
        Scanner scanner = new Scanner(System.in);
        System.out.print(">> ");

        rect.width = scanner.nextInt();
        rect.height = scanner.nextInt();

        System.out.println("사각형의 면적은 " + rect.getArea());

        scanner.close();
    }
}
