package examples; /**
 * 예제 3-6
 * "exit"이 입력되면 while문을 벗어나도록 break문을 활용하는 프로그램
 */

import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("exit를 입력하면 종료합니다.");
        while(true) {
            System.out.print(">>");
            String text = scanner.nextLine();
            if(text.equals("exit")) // 문자열 비교 시 equals() 사용
                break;
        }
        System.out.println("종료합니다...");

        scanner.close();
    }
}
