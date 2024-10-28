/**
 * chap03 - prac14
 * - 겜블링 게임 프로그램
 * > 사용자가 엔터키를 입력하면 0, 1, 2 중에서 랜덤하게 3개의 수를 생성하여 출력
 * > 3개가 모두 같은 값 : "성공. 대박났어요!" 출력
 */

package chap03;

import java.util.Scanner;

public class GamblingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] randomArray = new int[3];

        System.out.println("***** 갬블링 게임을 시작합니다. *****");
        while(true) {
            System.out.print("엔터키 입력>>");
            String enter = scanner.nextLine();

            for (int i=0; i<3; i++) {
                int random = (int)(Math.random()*3);
                randomArray[i] = random;
                System.out.print(random + " ");
            }
            System.out.println();

            if ((randomArray[0] == randomArray[1]) && (randomArray[1] == randomArray[2])) {
                System.out.println("성공! 대박 났어요!");
                System.out.print("게속하시겠습니까?(yes/no)>>");
                String yesNo = scanner.nextLine();
                if(yesNo.equals("yes")) continue;
                if (yesNo.equals("no")) break;
            }
        }
        scanner.close();
    }
}
