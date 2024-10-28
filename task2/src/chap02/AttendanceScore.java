/**
 * chap02 - prac05
 * - 두 학생의 출석 점수를 입력하고 점수를 비교하는 프로그램
 * > 출석 점수는 총 100점 , 지각: -3 , 결석: -8
 * > 점수가 같은 경우 "점수 동일"이라고 출력
 */

package chap02;

import java.util.Scanner;

public class AttendanceScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생1>>");
        String name1 = scanner.next();
        int late1 = scanner.nextInt();
        int absent1 = scanner.nextInt();
        int minus1 = late1*3 + absent1*8;

        System.out.print("학생2>>");
        String name2 = scanner.next();
        int late2 = scanner.nextInt();
        int absent2 = scanner.nextInt();
        int minus2 = late2*3 + absent2*8;

        System.out.println(name1 + "의 감점은 " + minus1 + ", " + name2 + "의 감점은 " + minus2);

        if (minus2 > minus1) {
            System.out.println(name1 + "의 출석 점수가 더 높음. " + name1 + " 출석 점수는 " + (100-minus1));
        } else if (minus2 < minus1) {
            System.out.println(name2 + "의 출석 점수가 더 높음. " + name2 + " 출석 점수는 " + (100-minus2));
        } else
            System.out.println("점수 동일");
        scanner.close();
    }
}
