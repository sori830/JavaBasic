/**
 * Quiz6
 * - 개인 정보 중 일부를 비공개로 전환하는 프로그램
 * > 증명서의 이름/주민번호/전화번호를 키보드로 입력받는 메소드 getData()로 선언
 * > 데이터를 비식별표기(*)로 변경하는 메소드 translateData()를 선언
 * > 두 개의 메소드를 호출하여 결과를 출력
 */

import java.util.Scanner;

public class _Quiz_06 {

    // 증명서의 이름/주민번호/전화번호를 키보드로 입력받는 메소드
    public static String[] getData(Scanner scanner) {
        String[] personalInfo = new String[3];

        System.out.println("------ 개인정보 작성 ------");
        System.out.print("이름: ");
        personalInfo[0] = scanner.nextLine();

        System.out.print("주민번호: ");
        personalInfo[1] = scanner.nextLine();

        System.out.print("전화번호: ");
        personalInfo[2] = scanner.nextLine();

        return personalInfo;
    }

    // 데이터를 비식별표기(*)로 변경하는 메소드
    public static String[] translateData(String[] data) {
        String[] hiddenData = new String[3];

        // 이름
        String stars = "";
        for (int i = 0; i < data[0].length() - 1; i++) {
            stars += "*";
        }
        hiddenData[0] = data[0].charAt(0) + stars;
        // 주민번호
        hiddenData[1] = data[1].substring(0, 8) + "*******";
        // 전화번호
        hiddenData[2] = data[2].substring(0, data[2].length() - 4) + "****";

        return hiddenData;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] personalInfo = getData(scanner);
        String[] hiddenInfo = translateData(personalInfo);

        System.out.println("----- 비식별표기로 변경 -----");
        System.out.println("이름: " + hiddenInfo[0]);
        System.out.println("주민번호: " + hiddenInfo[1]);
        System.out.println("전화번호: " + hiddenInfo[2]);

        scanner.close();
    }
}
