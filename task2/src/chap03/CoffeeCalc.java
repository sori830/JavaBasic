/**
 * chap03 - prac17
 * - 커피와 가격을 각각 배열로 만들어 주문을 받아 가격을 계산하는 프로그램
 */

package chap03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CoffeeCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String coffee[] = {"핫아메리카노", "아이스아메리카노", "카푸치노", "라떼"};
        int price[] = {3000, 3500, 4000, 5000};

        System.out.println("핫아메리카노, 아이스아메리카노, 카푸치노, 라떼 있습니다.");

        while(true) {
            int count = 0;
            boolean isMenu = false;
            boolean isInt = false;


            try {
                System.out.print("주문>>");
                String coffeeName = scanner.next();
                if(coffeeName.equals("그만")) break;

                count = scanner.nextInt();

                for (int i=0; i< coffee.length; i++) {
                    if (coffeeName.equals(coffee[i])) {
                        System.out.println("가격은 " + price[i]*count + "원입니다.");
                        isMenu = true;
                        break;
                    }
                }

                if (!isMenu) System.out.println(coffeeName + "는 없는 메뉴입니다.");
            }
            catch (InputMismatchException e) {
                System.out.println("잔 수는 양의 정수로 입력해주세요!");

                scanner.nextLine(); // ‼️버퍼 비우기
            }
        }
        scanner.close();
    }
}