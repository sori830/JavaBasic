/*
    예제 5-6 : 메소드 오버라이딩
 */

package examples;

// 직접 작성하기!
class Weapon {
    protected int fire() {
        return 1; // 무기는 기본적으로 한 명만 살상
    }
}

class Cannon extends Weapon {
    @Override
    protected int fire() {
        return 10;
    }
}

public class Overriding {
    public static void main(String[] args) {
        Weapon weapon = new Weapon();
        System.out.println("기본 무기의 살상 능력은 " + weapon.fire());
        weapon = new Cannon();
        System.out.println("대포의 살상 능력은 " + weapon.fire());
    }
}

// 예제 따라하기!
//class Weapon { // 슈퍼 클래스
//    protected int fire() {
//        return 1; // 무기는 기본적으로 한 명만 살상
//    }
//}
//
//class Cannon extends Weapon { // 서브 클래스
//    @Override
//    protected int fire() { // 오버라이딩
//        return 10; // 대포는 한 번에 10명을 살상
//    }
//}
//
//public class Overriding {
//    public static void main(String[] args) {
//        Weapon weapon;
//        weapon = new Weapon(); // Weapon 객체 생성
//        System.out.println("기본 무기의 살상 능력은 " + weapon.fire());
//        weapon = new Cannon(); // Cannon 객체 생성
//        System.out.println("대포의 살상 능력은 " + weapon.fire());
//    }
//}
