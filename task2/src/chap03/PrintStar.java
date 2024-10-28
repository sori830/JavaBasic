/**
 * chap03 - prac03
 * - 양의 정수를 입력받아 *를 출력하는 프로그램
 * > 양의 정수가 입력될 때까지 계속 입력을 받도록 하기
 */
package chap03;

import java.util.Scanner;

public class PrintStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int starNum;

        do {
            System.out.print("양의 정수 입력>>");
            starNum = scanner.nextInt();
        }while(starNum < 0);

        for (int i=0; i<starNum; i++) {
            for (int j=i; j<starNum; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        scanner.close();
    }
}
