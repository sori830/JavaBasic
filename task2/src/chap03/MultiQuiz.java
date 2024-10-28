/**
 * chap03 - prac11
 * - 구구단 퀴즈의 답을 검사하는 프로그램
 * > 3번 틀리면 종료
 */

package chap03;

import java.util.Scanner;

public class MultiQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fail = 0;

        System.out.println("***** 구구단을 맞추는 퀴즈입니다. *****");

        while (fail < 3) {  // 3번 틀리면 종료
            int randomNum1 = (int)(Math.random() * 9 + 1);
            int randomNum2 = (int)(Math.random() * 9 + 1);

            System.out.print(randomNum1 + "x" + randomNum2 + "=");
            int solveNum = scanner.nextInt();

            if (solveNum == (randomNum1 * randomNum2)) {
                System.out.println("정답입니다. 잘했습니다.");
            } else {
                fail++;
                if (fail < 3) {  // 3번째 실패가 아니면 출력
                    System.out.println(fail + "번 틀렸습니다. 분발하세요.");
                }
            }
        }

        System.out.println("3번 틀렸습니다. 퀴즈 종료합니다.");
        scanner.close();
    }
}
