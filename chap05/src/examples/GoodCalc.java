/*
    예제 5-7 : 추상 클래스의 구현 연습
    추상 클래스 Calculator를 상속받은 GoodCalc 클래스 구현해보기!
 */

package examples;

// 주어진 추상 클래스 Calculator
abstract class Calculator {
    public abstract int add(int a, int b);
    public abstract int subtract(int a, int b);
    public abstract double average(int[] a);
}

// 직접 구현해보기! 👍🏻👍🏻
public class GoodCalc extends Calculator {
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int subtract(int a, int b) {
        if (a>b) return a-b;
        else return b-a;
    }

    @Override
    public double average(int[] a) {
        double sum = 0;
        for (int i : a) {
            sum += i;
        }
//        for (int i = 0; i<a.length; i++) {
//            sum += a[i];
//        }
        return sum/a.length;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 10, 22, 9};

        Calculator calc; // 다형성 실현을 위해 Calculator로 선언
        calc = new GoodCalc();
        System.out.println("합은 " + calc.add(1,2));
        System.out.println("차는 " + calc.subtract(1,2));
        System.out.println("평균은 " + calc.average(numbers));
    }
}

// 예제 따라하기
//public class GoodCalc extends Calculator {
//    @Override
//    public int add(int a, int b) { // 추상 메소드 구현
//        return a + b;
//    }
//    @Override
//    public int subtract(int a, int b) {
//        return a-b;
//    }
//    @Override
//    public double average(int[] a) {
//        double sum = 0;
//        for (int i=0; i<a.length; i++) {
//            sum += a[i];
//        }
//        return sum/a.length;
//    }
//
//    public static void main(String[] args) {
//        GoodCalc c = new GoodCalc();
//        System.out.println(c.add(2,3));
//        System.out.println(c.subtract(2,3));
//        System.out.println(c.average(new int[] { 2, 3, 4 }));
//    }
//}