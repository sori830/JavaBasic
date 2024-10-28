/**
 * chap03 - prac01
 * - 반복문 연습
 */

package chap03;

public class LoopPrac {
    // (1) 무엇을 계산하는 코드인가? 실행 결과 출력되는 내용은?
    // 첫항이 1, 마지막항이 50, 공차가 3인 등차수열을 계산하는 코드이다. 실행 결과 출력되는 내용은 425이다.

    public static void main(String[] args) {
        int whileLoopSum=0, forLoopSum=0, doWhileLoopSum=0;
        int i=1, j=1, k=1;

        // (2) 위의 코드를 main() 메소드로 만들고 WhileLoop 클래스로 완성하라.
        System.out.println("[WhileLoop]");
        while(true) {
            if(i > 50)
                break;
            whileLoopSum = whileLoopSum + i;
            i += 3;
        }
        System.out.println(whileLoopSum);

        // (3) for 문을 이용하여 동일하게 실행되는 ForLoop 클래스를 작성하라.
        System.out.println("[forLoop]");
        for(j=1; j<=50; j+=3) {
            forLoopSum = forLoopSum + j;
        }
        System.out.println(forLoopSum);

        // (4) do-while 문을 이용하여 동일하게 실행되는 DoWhileLoop 클래스를 작성하라.
        System.out.println("[doWhileLoop]");
        do {
            doWhileLoopSum = doWhileLoopSum + k;
            k += 3;
        }while(k <= 50);
        System.out.println(doWhileLoopSum);
    }
}
