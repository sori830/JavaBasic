/**
 * chap03 - prac10
 * - 0~255 범위의 정수 16개를 랜덤하게 생성한 2차원 정수 배열을 입력받은 임계값에 따라 수정하는 프로그램
 * > 임계값보다 크면 255, 작거나 같으면 0으로 배열을 수정
 */

package chap03;

import java.util.Scanner;

public class SetThresholdArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] randomIntArray = new int[4][4];

        // 4x4 배열에 랜덤한 값 저장 및 출력
        System.out.println("4x4 배열에 랜덤한 값을 저장한 후 출력합니다.");
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                randomIntArray[i][j] = (int)(Math.random()*255);
                System.out.printf("%-5d",randomIntArray[i][j]);
            }
            System.out.println();
        }

        // 임계값 입력
        System.out.print("임계값 입력>>");
        int threshold = scanner.nextInt();

        // 2차원 배열에 저장된 정수가 임계값보다 크면 255, 작거나 같으면 0으로 수정
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                if (randomIntArray[i][j] > threshold) randomIntArray[i][j] = 255;
                else randomIntArray[i][j] = 0;
                System.out.printf("%-5d" ,randomIntArray[i][j]);
            }
            System.out.println();
        }
        scanner.close();
    }
}
