/**
 * chap02 - prac03
 * - 분식점 가격 계산 프로그램
 * > 떡볶이 1인분: 2000원
 * > 김말이 1인분: 1000원
 * > 쫄면 1인분: 3000원
 */

package chap02;

import java.util.Scanner;

public class SnackbarCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**** 자바 분식입니다. 주문하면 금액을 알려드립니다. ****");

        System.out.print("떡볶이 몇 인분>>");
        int tteokbokki = scanner.nextInt();
        System.out.print("김말이 몇 인분>>");
        int gimmari = scanner.nextInt();
        System.out.print("쫄면 몇 인분>>");
        int jjolmyeon = scanner.nextInt();

        int price = tteokbokki * 2000 + gimmari * 1000 + jjolmyeon * 3000;
        System.out.println("전체 금액은 " + price + "원입니다.");

        scanner.close();
    }
}
