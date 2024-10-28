/**
 * chap03 - prac07
 * - 11~19 범위의 정수를 랜덤하게 생성하여 배열에 저장하고 평균을 출력하는 프로그램
 */

package chap03;

public class RandomArrAvg {
    public static void main(String[] args) {
        int[] randomIntArray = new int[10];
        int sum =0;
        double avg = 0;

        System.out.print("랜덤한 정수들...");

        for (int i=0; i<randomIntArray.length; i++) {
            randomIntArray[i] = (int)(Math.random()*9) + 11;
            System.out.print(randomIntArray[i] + " ");
        }
        System.out.println();

        for (int i=0; i<randomIntArray.length; i++) {
            sum += randomIntArray[i];
        }
        avg = (double) sum /10;
        System.out.println("평균은 " + avg);
    }
}
