/*
    예제 6-9 : StringTokenizer 클래스 메소드 활용
 */

import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        StringTokenizer st1 = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/");
        StringTokenizer st2 = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/", true);

        System.out.println("--- returnDelims가 false ---");
        while(st1.hasMoreTokens()) // hasMoreTokens() : 스트링 토큰나이저에 다음 토큰이 있으면 true 리턴
            System.out.println(st1.nextToken()); // nextToken() : 스트링 토큰나이저에 들어 있는 다음 토큰 리턴

        System.out.println("--- returnDelims가 true ---");
        while(st2.hasMoreTokens()) // hasMoreTokens() : 스트링 토큰나이저에 다음 토큰이 있으면 true 리턴
            System.out.println(st2.nextToken()); // nextToken() : 스트링 토큰나이저에 들어 있는 다음 토큰 리턴
    }
}
