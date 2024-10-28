/**
 * chap03 - prac06
 * - 배열에 저장된 정수 중 자리수의 합이 9인 것을 가려내어 출력하는 프로그램
 */

package chap03;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[10];

        System.out.print("양의 정수 10개 입력>>");
        for (int i=0; i<intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }

        System.out.print("자리수의 합이 9인 것은 ...");
        for (int i=0; i< intArray.length; i++) {
            int temp = intArray[i]; // while문에서 intArray[i]의 값을 바꾸면 안되므로 temp에 저장해서 사용
            int sum = 0;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum == 9) System.out.print(intArray[i] + " ");
        }
        scanner.close();
    }
}
