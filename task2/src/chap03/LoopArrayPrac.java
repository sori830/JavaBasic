/**
 * chap03 - prac02
 * - 배열 반복문 연습
 */

package chap03;

public class LoopArrayPrac {
    // (1) 무엇을 계산하는 코드인가? 실행 결과 출력되는 내용은?
    // 배열 n의 원소 중 양수이면서 4의 배수인 것을 출력하는 코드이다.
    // 실행 결과 출력되는 내용은 20 72 256 이다.

    public static void main(String[] args) {
        int n[] = {1, -2, 6, 20, 5, 72, -16, 256};
        int i, j=0, k=0;

        // (2) 위의 코드를 main() 메소드로 만들고 ForLoopArray 클래스로 완성하라.
        System.out.println("[ForLoopArray]");
        for(i=0; i<n.length; i++) {
            if(n[i] > 0 && n[i] % 4 == 0) {
                System.out.print(n[i] + " ");
            }
        }
        System.out.println();

        // (3) while 문을 이용하여 동일하게 실행되는 WhileLoopArray 클래스를 작성하라.
        System.out.println("[WhileLoopArray]");
        while (j < n.length) {
            if (n[j] > 0 && n[j] % 4 == 0) {
                System.out.print(n[j] + " ");
            }
            j++;
        }
        System.out.println();

        // (4) do-while 문을 이용하여 동일하게 실행되는 DoWhileLoopArray 클래스를 작성하라.
        System.out.println("[DoWhileLoopArray]");
        do {
            if (n[k] > 0 && n[k] % 4 == 0) {
                System.out.print(n[k] + " ");
            }
            k++;
        }while(k < n.length);
    }
}
