/**
 * [Quiz 4]
 * - 조건문을 활용한 주차 요금 정산 프로그램
 * - 주차요금은 시간 당 4000원 (일일 최대 요금 : 30000원)
 * - 경차 및 장애인 차량은 최종 요금에서 50% 할인
 *
 * > 입력 데이터 : 차종, 주차시간
 * > 출력 데이터 : 요금
 * > 주차 시간으로 요금 먼저 계산하고, 차종 별로 최종요금 출력
 */

import java.util.Scanner;

public class _Quiz_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String carType = scanner.next();  // 차종 입력 (regularCar, compactCar, disabledCar)
        int time = scanner.nextInt();     // 주차 시간 입력 (단위 : 시간)

        int price = time * 4000;  // 시간 당 4000원 계산하여 변수 price에 저장

        // 일일 최대 요금을 30000원으로 제한
        if (price > 30000) {
            price = 30000;
        }

        // 일반차량(regularCar)은 price 변동 없음
        // 경차(compactCar) 및 장애인 차량(disabledCar)은 price에서 50% 할인
        if (carType.equals("compactCar") || carType.equals("disabledCar")) {
            price /= 2;
        }

        System.out.print("[" + carType + "] ");
        System.out.println(time + "시간 사용했습니다.");
        System.out.println("주차요금은 " + price + "원 입니다.");

        scanner.close();
    }
}
