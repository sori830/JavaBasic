/**
 * chap02 - prac02
 * - 사용자에게 8자리 정수(생년월일)를 입력받아 년도/월/일을 나누어 출력하는 프로그램
 */
package chap02;

import java.util.Scanner;

public class PrintBirth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("생일을 입력하세요>>>");
        int birth = scanner.nextInt();

        int day = birth % 100;
        int year = birth / 10000;
        int month = (birth / 100) % year;

        System.out.println(year +"년 " + month + "월 " + day + "일");

        scanner.close();
    }
}
