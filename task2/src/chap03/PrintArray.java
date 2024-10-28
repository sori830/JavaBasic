/**
 * chap03 - prac04
 * - 2차원 배열(비정방형 배열) n을 출력하는 프로그램
 * > int n [][] = {{1,2,3}, {1,2}, {1}, {1,2,3}, {1,2,3,4}}
 */

package chap03;

public class PrintArray {
    public static void main(String[] args) {
        int[][] n = {{1,2,3}, {1,2}, {1}, {1,2,3}, {1,2,3,4}};

        for (int i=0; i<n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
