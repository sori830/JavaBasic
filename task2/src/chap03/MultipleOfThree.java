/**
 * chap03 - prac05
 * - 배열에 저장된 정수 중 3의 배수만 출력하는 프로그램
 */

package chap03;

import java.util.Scanner;

public class MultipleOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[10];

        System.out.print("양의 정수 10개 입력>>");
        for (int i=0; i<intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }

        System.out.print("3의 배수는...");
        for (int i=0; i< intArray.length; i++) {
            if(intArray[i]%3 == 0)
                System.out.print(intArray[i] + " ");
        }
        scanner.close();
    }
}
