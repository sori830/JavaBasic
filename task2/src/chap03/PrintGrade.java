/**
 * chap03 - prac13
 * - 과목명을 입력받아 학점을 출력하는 프로그램
 * > 과목과 학점이 들어 있는 다음 2개의 배열 활용
 * >> String course [] = {"C", "C++", "Python", "Java", "HTML5"};
 * >> String grade [] = {"A", "B+", "B", "A+", "D"};
 * > "그만"을 입력하면 프로그램 종료
 */

package chap03;

import java.util.Scanner;

public class PrintGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String course [] = {"C", "C++", "Python", "Java", "HTML5"};
        String grade [] = {"A", "B+", "B", "A+", "D"};

        while (true) {
            boolean found = false;
            System.out.print("과목>>");
            String courseName = scanner.next();

            if (courseName.equals("그만")) break;

            for (int i = 0; i < course.length; i++) {
                if (course[i].equals(courseName)) {
                    System.out.println(courseName + " 학점은 " + grade[i]);
                    found = true;
                    break;
                }
            }

            if (!found) System.out.println(courseName + "는 없는 과목입니다.");
        }
        scanner.close();
    }
}
