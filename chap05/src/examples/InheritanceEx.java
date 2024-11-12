/*
    예제 5-2 : 상속 관계에 있는 클래스 간 멤버 접근
    클래스 Person을 아래와 같은 멤버 필드를 갖도록 선언하고 클래스 Student는 클래스 Person을 상속받아 각 멤버 필드에 값을 저장
    Person 클래스의 private 필드인 weight는 Student 클래스에서는 접근 불가능 -> 슈퍼 클래스인 Person의 getXXX, setXXX 메소드를 통해서만 조작 가능
    - private int weight;
    - int age;
    - protected int height;
    - public String name;
 */

package examples;

import javax.swing.*;

// 직접 해보기!
class Person {
    private int weight; // 접근지정자 private --> 다른 모든 클래스에 접근 불허
    int age; // 접근지정자 default --> 패키지 내 모든 클래스에 접근 허용
    protected int height; // 접근지정자 protected --> 같은 패키지 내의 모든 클래스에 접근 허용 (서브 클래스의 경우 다른 패키지여도 접근 가능)
    public String name; // 접근지정자 public --> 다른 모든 클래스에 접근 허용

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() { // weight를 반환해줘야하기 때문에 메소드를 int로 선언해야 함
        return weight;
    }
}

class Student extends Person {
    public void set() {
        age = 40;
        height = 180;
        name = "아무개";
        setWeight(80);
        System.out.println(name + ": " + age + "세, 키 " + height + "cm, 몸무게 " + getWeight() + "kg");
    }
}

public class InheritanceEx {
    public static void main(String[] args) {
        Student s = new Student();
        s.set();
    }
}

// 예제 따라쓰기!
//class Person {
//    private int weight;
//    int age;
//    protected int height;
//    public String name;
//
//    public void setWeight(int weight) {
//        this.weight = weight;
//    }
//
//    public int getWeight() {
//        return weight;
//    }
//}
//
//class Student extends Person {
//    public void set() {
//        age = 30;
//        name = "홍길동";
//        height = 175;
//        setWeight(99);
//        // weight = 99 // 오류!! 서브클래스 Student에서 슈퍼클래스의 private 멤버인 weight에 접근 불가!
//    }
//
//    public void printStudentSet() {
//        System.out.println("나이: " + age);
//        System.out.println("이름: " + name);
//        System.out.println("키: " + height);
//        System.out.println("몸무게: " + getWeight());
//    }
//}
//
//public class InheritanceEx {
//    public static void main(String[] args) {
//        Student s = new Student();
//        s.set();
//        s.printStudentSet();
//    }
//}
