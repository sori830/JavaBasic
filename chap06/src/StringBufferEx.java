/*
    예제 6-8 : StringBuffer 클래스 메소드 활용
 */

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This"); // 문자열 "This"로 초기화된 스트링 버퍼 객체 sb 생성
        System.out.println(sb); // This

        sb.append(" is pencil"); // 문자열 덧붙이기
        System.out.println(sb); // This is pencil

        sb.insert(7, " my"); // 위치 7에 문자열 "my" 삽입
        System.out.println(sb); // This is my pencil

        sb.replace(8, 10, "your"); // 위치 8부터 9까지의 문자(my)를 your로 대치
        System.out.println(sb); // This is your pencil

        sb.delete(8, 13); // 위치 8부터 12까지의 문자열 삭제
        System.out.println(sb); // This is pencil

        sb.setLength(4); // 스트링 버퍼 내 문자열 길이를 4로 재설정 -> 원래 길이가 4보다 크므로 잘림!
        System.out.println(sb); // This
    }
}
