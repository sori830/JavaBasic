/**
 * chap02 - prac01
 * - scanner 클래스를 이용해 달러를 입력받아 원화로 바꾸는 프로그램
 * > $1 = 1200원으로 가정
 */
package chap02;

import java.util.Scanner;

public class DollarToWon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("$1=1200원입니다. 달러를 입력하세요>>>");
        int dollar = scanner.nextInt();

        int won = dollar * 1200;
        System.out.println("$" + dollar + "는 " + won + "원입니다.");

        scanner.close();
    }
}
