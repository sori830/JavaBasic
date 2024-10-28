/**
 * chap03 - prac09
 * - 2차원 정수 배열을 생성하고, 0~255 범위의 정수 16개를 랜덤하게 생성하여 저장한 후 출력하는 프로그램
 */

package chap03;

public class TwoDimenRandomArr {
    public static void main(String[] args) {
        int[][] twoDimenIntArray = new int[4][4];

        System.out.println("4x4 배열에 랜덤한 값을 저장한 후 출력합니다.");
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                twoDimenIntArray[i][j] = (int)(Math.random() * 255);
                System.out.printf("%-5d ", twoDimenIntArray[i][j]); // System.out.printf : 형식에 맞춰 출력할 때 쓰는 함수
            }
            System.out.println();
        }
    }
}
