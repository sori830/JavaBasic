package test08;

import test07.coffee.CoffeeByName;

public class _02_GenericClass {
    public static void main(String[] args) {
        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();
        CoffeeByName c4 = new CoffeeByName("Nick");
        c4.ready();

        System.out.println("=======================================");
        int c3Name = (int) c3.name;
        // int로 형변환(캐스팅) 해야하는 이유?
        // CoffeeByName 클래스의 name 필드가 Object 타입이기 때문!
        // Object는 자바에서 모든 클래스의 최상위 부모 클래스이기 때문에 어떤 타입이든 저장할 수 있음
        // 그러나 값을 꺼내올 때는 그 타입이 무엇인지 컴파일러가 알 수 없음 --> 명시적 형변환 필수!!
        System.out.println("Order Number is : " + c3Name);

        String c4Name = (String) c4.name;
        System.out.println("Order Name is : " + c4Name);
    }
}
