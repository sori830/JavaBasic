/**
 * chap02 - prac06
 * - 나이를 입력하면 나이에 맞는 초의 개수를 계산하는 프로그램
 * > 빨간 초: 10살 , 파란 초: 5살 , 노란 초: 1살
 * > 전체 초의 개수가 최소가 되도록 하기
 * > 나이에 0이나 음수가 입력되면 예외처리
 */
package chap02;

import java.util.Scanner;

public class CandleCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int redCandle;
        int blueCandle;
        int yellowCandle;
        int total;

        System.out.print("나이를 입력하세요>>");
        int age = scanner.nextInt();

        if (age <= 0) {
            System.out.println("나이는 양수로만 입력하세요.");
        }
        else {
            redCandle = age / 10;
            blueCandle = (age % 10) / 5;
            yellowCandle = (age % 10) % 5;
            total = redCandle + blueCandle + yellowCandle;
            System.out.println("빨간 초 " + redCandle + "개, " + "파란 초 " + blueCandle + "개, " + "노란 초 " + yellowCandle + "개. 총 " + total + "개가 필요합니다.");
        }
        scanner.close();
    }
}
