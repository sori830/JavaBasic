/*
    예제 5-8 : 인터페이스 구현
    PhoneInterface 인터페이스를 구현하고 flash() 메소드를 추가한 SamsungPhone 클래스 작성하기
 */

package examples;

//// 예제 5-8
//interface PhoneInterface { // 인터페이스 선언
//    final int TIMEOUT = 10000; // 상수 필드 선언 -> final 생략 가능
//    void sendCall(); // 추상 메소드
//    void receiveCall(); // 추상 메소드
//    default void printLogo() { // default 메소드 -> 자동 상속
//        System.out.println("** Phone **");
//    }
//}
//
//class SamsungPhone implements PhoneInterface { // 인터페이스 구현
//    // PhoneInterface의 🔥모든 추상 메소드 구현🔥
//    @Override
//    public void sendCall() {
//        System.out.println("띠리리리링");
//    }
//    @Override
//    public void receiveCall() {
//        System.out.println("전화가 왔습니다.");
//    }
//
//    // 메소드 추가 작성
//    public void flash() {
//        System.out.println("전화기에 불이 켜졌습니다.");
//    }
//}
//
//public class InterfaceEx {
//    public static void main(String[] args) {
//        SamsungPhone phone = new SamsungPhone();
//        phone.printLogo();
//        phone.sendCall();
//        phone.receiveCall();
//        phone.flash();
//    }
//}

/*
    예제 5-9 : 인터페이스를 구현하고 동시에 클래스를 상속받는 사례
 */

interface PhoneInterface { // 인터페이스 선언
    final int TIMEOUT = 10000; // 상수 필드 선언 -> final 생략 가능
    void sendCall(); // 추상 메소드
    void receiveCall(); // 추상 메소드
    default void printLogo() { // default 메소드 -> 자동 상속
        System.out.println("** Phone **");
    }
}
interface MobilePhoneInterface extends PhoneInterface {
    void sendSMS();
    void receiveSMS();
}
interface MP3Interface {
    public void play();
    public void stop();
}
class PDA {
    public int calculate(int x, int y) {
        return x + y;
    }
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface { // 인터페이스 구현
    // MobilePhoneInterface의 추상 메소드 구현
    @Override
    public void sendCall() {
        System.out.println("따르르르릉~~");
    }
    @Override
    public void receiveCall() {
        System.out.println("전화 왔어요!!");
    }
    @Override
    public void sendSMS() {
        System.out.println("문자갑니다!");
    }
    @Override
    public void receiveSMS() {
        System.out.println("문자왔어요!");
    }
    @Override
    public void play() {
        System.out.println("음악 재생");
    }
    @Override
    public void stop() {
        System.out.println("음악 정지");
    }

    // 메소드 추가 작성
    public void schedule() {
        System.out.println("일정입니다!");
    }
}

public class InterfaceEx {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.printLogo();
        phone.sendCall();
        phone.play();
        System.out.println("3과 5를 더하면 " + phone.calculate(3,5));
        phone.schedule();
    }
}
