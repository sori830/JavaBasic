/**
 * chap02 - prac12
 * - 자동차의 상태를 나타내는 정수를 입력받아 자동차의 상태를 출력하는 프로그램
 */
package chap02;

import java.util.Scanner;

public class CarState {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("자동차 상태 입력>>");
        int status = scanner.nextInt();


        if((status & 0b10000000) == 0) System.out.print("자동차는 정지 상태이고 ");
        else System.out.print("자동차는 달리는 상태이고 ");
        if((status & 0b01000000) == 0) System.out.print("에어컨이 꺼진 상태이고 ");
        else System.out.print("에어컨이 켜진 상태이고 ");
        System.out.println("온도는 " + (status & 0b0111111) + "도이다.");

        scanner.close();
    }
}
