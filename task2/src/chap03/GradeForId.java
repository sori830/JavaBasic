/**
 * chap03 - prac18
 * - 학번을 입력하면 점수를 출력하는 프로그램
 * > 1차원 정수 배열에 10명 학생의 학번과 점수 입력
 * > 학번으로 검색: 1, 점수로 검색: 2, 끝내려면 3
 */

package chap03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GradeForId {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] id = new int[10];
        int[] score = new int[10];

        System.out.println("10명 학생의 학번과 점수 입력");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ">>");
            id[i] = scanner.nextInt();
            score[i] = scanner.nextInt();
        }

        while (true) {
                System.out.print("학번으로 검색: 1, 점수로 검색: 2, 끝내려면 3>>");

                int inputNum = scanner.nextInt();

                if (inputNum == 1) {
                    while (true) {
                        try {
                            System.out.print("학번>>");
                            int idNum = scanner.nextInt();
                            boolean isThere = false;

                            for (int i = 0; i < 10; i++) {
                                if (idNum == id[i]) {
                                    System.out.println(score[i] + "점");
                                    isThere = true;
                                    break;
                                }
                            }
                            if (!isThere) {
                                System.out.println(idNum + "의 학생은 없습니다.");
                            }
                            else break;
                        } catch (InputMismatchException e) {
                            System.out.println("경고!! 정수를 입력하세요.");
                            scanner.nextLine();
                        }
                    }
                }

                else if (inputNum == 2) {
                    while(true) {
                        try {
                            System.out.print("점수>>");
                            int scoreNum = scanner.nextInt();
                            boolean isScore = false;

                            System.out.print("점수가 " + scoreNum + "인 학생은 ");

                            for (int i = 0; i < 10; i++) {
                                if (scoreNum == score[i]) {
                                    System.out.print(id[i] + " ");
                                    isScore = true;
                                }
                            }
                            if (!isScore) {
                                System.out.println("없습니다.");
                            } else {
                                System.out.println("입니다.");
                                break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("경고!! 정수를 입력하세요.");
                            scanner.nextLine();
                        }
                    }
                }

                else {
                    System.out.print("프로그램을 종료합니다.");
                    break;
                }
        }
    }
}