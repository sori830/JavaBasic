/**
 * [Quiz 5]
 * - 배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력하는 프로그램
 * - 신발 사이즈는 250부터 295까지 5단위로 증가 (10가지)
 *
 * > 입력 데이터 : 관리자-관리자 비밀번호, 신발 사이즈 별 재고 & 모든사용자-신발 사이즈
 * > 출력 데이터 : 입력받은 신발 사이즈의 재고
 */

import java.util.Scanner;

public class _Quiz_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] shoesArray = { // 현재 신발 재고
                {250, 20}, {255, 20}, {260, 20}, {265, 10},
                {270, 30}, {275, 50}, {280, 15}, {285, 0},
                {290, 10}, {295, 20}
        };

        System.out.println("사용자 모드: 1 , 관리자 모드: 2 , 종료: -1");
        System.out.print(">>> ");
        int authNum = scanner.nextInt();

        while (authNum != -1) {
            switch (authNum) {
                case 1:
                    System.out.print("신발 사이즈를 입력하세요: ");
                    int shoesSize = scanner.nextInt(); // 신발 사이즈 입력받기
                    boolean sizeFound = false; // 판매하는 사이즈 확인

                    for (int i = 0; i < shoesArray.length; i++) {
                        if (shoesArray[i][0] == shoesSize) {
                            sizeFound = true;
                            if (shoesArray[i][1] > 0) {
                                System.out.println("사이즈: " + shoesSize + " (재고 있음)");
                            } else {
                                System.out.println("사이즈: " + shoesSize + " (재고 없음)");
                            }
                            break; // 사이즈를 찾으면 반복문을 종료
                        }
                    }

                    if (!sizeFound) { // 없는 사이즈를 입력한 경우
                        System.out.println("없는 사이즈입니다!");
                    }
                    break;
                case 2:
                    System.out.print("재고를 업로드할 신발 사이즈를 입력하세요: ");
                    int size = scanner.nextInt();

                    for (int i = 0; i < shoesArray.length; i++) {
                        if (shoesArray[i][0] == size) {
                            System.out.print("재고를 입력하세요: ");
                            shoesArray[i][1] = scanner.nextInt();
                        }
                    }
                    break;
            }
            System.out.println("사용자 모드: 1 , 관리자 모드: 2 , 종료: -1");
            System.out.print(">>> ");
            authNum = scanner.nextInt();
        }
    }
}

