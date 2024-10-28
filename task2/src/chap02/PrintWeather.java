/**
 * chap02 - prac07
 * - 숫자를 입력받아 계절을 출력하는 프로그램
 * > 3~5: 따뜻한 봄 , 6~8: 바다가 즐거운 여름 , 9~11: 낙엽이 지는 아름다운 가을 , 12~1: 눈 내리는 하얀 겨울
 * > 그 외 숫자를 입력한 경우: "1~12만 입력하세요." 출력
 */

package chap02;

import java.util.Scanner;

public class PrintWeather {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("월을 입력하세요(1~12)>>");
        int month = scanner.nextInt();

//        // 1. if-else 문 이용
//        if ((month == 3) || (month == 4) || (month == 5))
//            System.out.println("따뜻한 봄");
//        else if ((month == 6) || (month == 7) || (month == 8))
//            System.out.println("바다가 즐거운 여름");
//        else if ((month == 9) || (month == 10) || (month == 11))
//            System.out.println("낙엽이 지는 아름다운 가을");
//        else if ((month == 12) || (month == 1) || (month == 2))
//            System.out.println("눈 내리는 하얀 겨울");
//        else
//            System.out.println("1~12만 입력하세요.");


        // 2. switch 문 이용
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("따뜻한 봄");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("바다가 즐거운 여름");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("낙엽이 지는 아름다운 가을");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("눈 내리는 하얀 겨울");
                break;
            default:
                System.out.println("1~12만 입력하세요.");
                break;
        }

        scanner.close();
    }
}
