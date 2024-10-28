/**
 * chap03 - prac15
 * - 2개의 정수를 입력받아 곱을 구하는 프로그램
 * > 정수가 아닌 것이 입력될 경우 InputMismatchException 예외 처리 해주기
 * > 정수가 입력될 경우 종료
 */

package chap03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiException {
    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("곱하고자 하는 정수 2개 입력>>");
            int n;
            int m;
            try {
                n = scanner.nextInt();
                m = scanner.nextInt();
                System.out.println(n + "x" + m + "=" + n * m);
                break;
            } catch (InputMismatchException e) {
                System.out.println("정수를 입력하세요!");
            }
        }
    }
}
