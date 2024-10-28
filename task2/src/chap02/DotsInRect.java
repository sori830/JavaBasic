/**
 * chap02 - prac09
 * - 점 (x,y)가 (10,10)과 (200,300)의 두 점으로 이루어진 사각형의 어느 곳에 있는지 판별하는 프로그램
 * > 사각형 안에 있는지 / 사각형 선 상에 있는지 / 사각형 외부에 있는지 를 판별
 */
package chap02;

import java.util.Scanner;

public class DotsInRect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점 (x, y)의 좌표 입력>>" );
        int xnum = scanner.nextInt();
        int ynum = scanner.nextInt();

        if ((xnum > 10) && (xnum < 200) && (ynum > 10) && (ynum < 300)) {
            System.out.println("(" + xnum + ", " + ynum +")는 사각형 안에 있습니다.");
        } else if ((xnum < 10) || (xnum > 200) && (ynum < 10) || (ynum > 300)) {
            System.out.println("(" + xnum + ", " + ynum +")는 사각형 밖에 있습니다.");
        } else if ((xnum == 10) || (xnum == 200) && (ynum == 10) || (ynum == 300)) {
            System.out.println("(" + xnum + ", " + ynum +")는 사각형 선 상에 있습니다.");
        }
        scanner.close();
    }
}
