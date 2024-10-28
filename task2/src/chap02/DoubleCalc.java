/**
 * chap02 - prac08
 * - 실수에 대한 사칙 연산을 수행하는 프로그램
 * > 3~5: 따뜻한 봄 , 6~8: 바다가 즐거운 여름 , 9~11: 낙엽이 지는 아름다운 가을 , 12~1: 눈 내리는 하얀 겨울
 * > 그 외 숫자를 입력한 경우: "1~12만 입력하세요." 출력
 */
package chap02;

import java.util.Scanner;

public class DoubleCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("연산 입력>>");
        double num1 = scanner.nextDouble();
        String op = scanner.next();
        double num2 = scanner.nextDouble();

//        // if-else 문
//        if (op.equals("더하기")) {
//            System.out.println(num1 + " 더하기 " + num2 + "의 계산 결과는 " + (num1+num2));
//        }
//        else if (op.equals("빼기")) {
//            System.out.println(num1 + " 빼기 " + num2 + "의 계산 결과는 " + (num1-num2));
//        }
//        else if (op.equals("곱하기")) {
//            System.out.println(num1 + " 곱하기 " + num2 + "의 계산 결과는 " + (num1*num2));
//        }
//        else if (op.equals("나누기")) {
//            System.out.println(num1 + " 나누기 " + num2 + "의 계산 결과는 " + (num1/num2));
//        }
//        else System.out.println("사칙연산이 아닙니다.");

        // switch 문
        switch (op) {
            case "더하기":
                System.out.println(num1 + " 더하기 " + num2 + "의 계산 결과는 " + (num1+num2));
                break;
            case "빼기":
                System.out.println(num1 + " 빼기 " + num2 + "의 계산 결과는 " + (num1-num2));
                break;
            case "곱하기":
                System.out.println(num1 + " 곱하기 " + num2 + "의 계산 결과는 " + (num1*num2));
                break;
            case "나누기":
                System.out.println(num1 + " 나누기 " + num2 + "의 계산 결과는 " + (num1/num2));
                break;
            default:
                System.out.println("사칙연산이 아닙니다.");
                break;
        }
        scanner.close();
    }
}
