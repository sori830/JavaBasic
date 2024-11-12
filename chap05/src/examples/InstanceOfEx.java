/*
    예제 5-4 : instanceof 연산자 활용
    instanceof 연산자를 이용하여 상속 관계에 따라 레퍼런스가 가리키는 객체의 타입을 알아보기
 */

package examples;

class Person1 {} // 슈퍼 클래스
class Student1 extends Person1 {} // Person1의 서브클래스 -> Person1 상속받음
class Researcher extends Person1 {} // Person1의 서브클래스 -> Person1 상속받음
class Professor extends Researcher {} // Researcher의 서브클래스 -> Researcher, Person1 상속받음

public class InstanceOfEx {
    static void print(Person1 p) {
        if (p instanceof Person1)
            System.out.print("Person1 ");
        if (p instanceof Student1)
            System.out.print("Student1 ");
        if (p instanceof Researcher)
            System.out.print("Researcher ");
        if (p instanceof Professor)
            System.out.print("Professor ");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("new Student1() ->\t"); print(new Student1()); // Person1, Student1 타입
        System.out.print("new Researcher() ->\t"); print(new Researcher()); // Person1, Researcher 타입
        System.out.print("new Professor() ->\t"); print(new Professor()); // Person1, Researcher, Professor 타입
    }
}
