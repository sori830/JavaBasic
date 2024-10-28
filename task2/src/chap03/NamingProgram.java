/**
 * chap03 - prac12
 * - "남" 혹은 "여"를 입력받아 이름을 작명하는 프로그램
 * > "그만"을 입력하면 프로그램 종료
 */

package chap03;

import java.util.Scanner;

public class NamingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] boyMiddleList =  { "기", "민", "용", "종", "현", "진", "재", "승", "소", "상", "지"};
        String[] boyLastList =  { "태", "진", "광", "혁", "우", "철", "빈", "준", "구", "호", "석"};
        String[] girlMiddleList =  { "은", "원", "경", "수", "현", "예", "여", "송", "서", "채", "하"};
        String[] girlLastList =  { "진", "연", "경", "서", "리", "숙", "미", "원", "린", "희", "수"};

        int middleIndex = 0;
        int lastIndex = 0;
        String firstName = null;
        String middleName = null;
        String lastName = null;
        String gender = null;

        System.out.println("***** 작명 프로그램이 실행됩니다. *****");
        while (true) {
            System.out.print("남/여 선택>>");
            gender = scanner.next();

            if (gender.equals("그만")) break;

            switch (gender) {
                case "여":
                    System.out.print("성 입력>>");
                    firstName = scanner.next();
                    middleIndex = (int) (Math.random() * girlMiddleList.length);
                    middleName = girlMiddleList[middleIndex];
                    lastIndex = (int) (Math.random() * girlLastList.length);
                    lastName = girlLastList[lastIndex];
                    System.out.println("추천 이름: " + firstName + middleName + lastName);
                    break;
                case "남":
                    System.out.print("성 입력>>");
                    firstName = scanner.next();
                    middleIndex = (int) (Math.random() * boyMiddleList.length);
                    middleName = boyMiddleList[middleIndex];
                    lastIndex = (int) (Math.random() * boyLastList.length);
                    lastName = boyLastList[lastIndex];
                    System.out.println("추천 이름: " + firstName + middleName + lastName);
                    break;
                default:
                    System.out.println("남/여/그만 중에서 입력하세요!");
                    break;
            }
        }
        scanner.close();
    }
}

// 더 간결한 코드 (조건 연산자 활용)

//        System.out.println("***** 작명 프로그램이 실행됩니다. *****");
//
//        while (true) {
//            System.out.print("남/여 선택>>");
//            String gender = scanner.next();
//
//            if (gender.equals("그만")) break;
//
//            if (!gender.equals("남") && !gender.equals("여")) {
//                System.out.println("남/여/그만 중에서 입력하세요!");
//                continue;
//            }
//
//            System.out.print("성 입력>>");
//            String firstName = scanner.next();
//
//            String[] middleList = gender.equals("남") ? boyMiddleList : girlMiddleList;
//            String[] lastList = gender.equals("남") ? boyLastList : girlLastList;
//
//            String middleName = middleList[(int) (Math.random() * middleList.length)];
//            String lastName = lastList[(int) (Math.random() * lastList.length)];
//
//            System.out.println("추천 이름: " + firstName + middleName + lastName);
//        }
