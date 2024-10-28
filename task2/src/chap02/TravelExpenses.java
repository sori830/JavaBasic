/**
 * chap02 - prac04
 * - 여행 경비를 계산하는 프로그램
 * > 방 하나에 2명까지 투숙 가능
 * > 1명만 투숙해도 1방의 비용 지불
 */

package chap02;

import java.util.Scanner;

public class TravelExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("여행지>>");
        String location = scanner.nextLine();
        System.out.print("인원수>>");
        int peopleNumber = scanner.nextInt();
        System.out.print("숙박일>>");
        int stayDay = scanner.nextInt();
        System.out.print("1인당 항공료>>");
        int airfare = scanner.nextInt();
        System.out.print("1방 숙박비>>");
        int roomCharge = scanner.nextInt();

        int room;

        if (peopleNumber % 2 == 1)
            room = peopleNumber/2 + 1;
        else
            room = peopleNumber/2;

        int travelExpenses = peopleNumber * airfare + room * roomCharge * stayDay;

        System.out.println(peopleNumber + "명의 " + location + " " + stayDay + "박 " + (stayDay+1) + "일 여행에는 방이 " + room + "개 필요하며 경비는 " + travelExpenses + "입니다.");

        scanner.close();
    }
}
