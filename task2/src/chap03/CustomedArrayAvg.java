/**
 * chap03 - prac08
 * - 배열의 크기를 입력받고 그 배열에 1~100 범위의 랜덤한 정수를 저장하고 평균을 출력하는 프로그램
 */

package chap03;

import java.util.Scanner;

public class CustomedArrayAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double avg = 0;

        System.out.print("정수 몇 개 저장하시겠습니까>>");
        int saveSet = scanner.nextInt();

        int[] customedIntArray = new int[saveSet];

        System.out.print("랜덤한 정수들...");
        for (int i=0; i<saveSet; i++) {
            customedIntArray[i] = (int) (Math.random() * 100);
            System.out.print(customedIntArray[i] + " ");
        }
        System.out.println();

        for (int i=0; i<saveSet; i++) {
            sum += customedIntArray[i];
        }
        avg = (double) sum / saveSet;
        System.out.print("평균은 " + avg);

        scanner.close();
    }
}
