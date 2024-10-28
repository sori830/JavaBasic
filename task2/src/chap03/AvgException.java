/**
 * chap03 - prac16
 * - 양수들을 한 줄에 입력받고 평균을 구하는 프로그램
 * > 양의 정수가 아닌 것들은 모두 빼고 구하기
 */

package chap03;

import java.util.Scanner;

public class AvgException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[100];
        int count = 0;
        int sum = 0;

        System.out.print("양의 정수를 입력하세요. -1은 입력 끝>>");

        while (true) {
            String input = scanner.next();
            if (input.equals("-1")) {  // 입력 종료 조건
                break;
            }

            try {
                int num = Integer.parseInt(input);

                if (num > 0) {
                    numbers[count] = num;
                    sum += num;
                    count++;
                } else {
                    System.out.println(input + " 제외");
                }
            } catch (NumberFormatException e) {
                System.out.println(input + " 제외");
            }

            if (count >= numbers.length) {
                System.out.println("더 이상 입력할 수 없습니다.");
                break;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("평균은 " + average);
        } else {
            System.out.println("평균을 계산할 수 없습니다.");
        }

        scanner.close();
    }
}
