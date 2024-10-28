package examples;

/**
 * 예제 3-3
 * do-while 문을 이용하여 'a'부터 'z'까지 출력하는 프로그램
 */

public class DoWhileSample {
    public static void main(String[] args) {
        char c = 'a';

        do { // 최소 한 번은 작업문 실행
            System.out.print(c);
            c = (char) (c + 1);
        } while (c <= 'z'); // 반복 조건!  true => 반복 / false => 반복 종료
    }
}
