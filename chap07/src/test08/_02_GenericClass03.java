package test08;

import test07.coffee.Coffee;

public class _02_GenericClass03 {
    public static void main(String[] args) {
        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        Coffee<String> c6 = new Coffee<>("Sam");
        c6.ready();

        int c5Name = c5.name;
        // Generic 사용 -> 형변환 안해도 됨!
        System.out.println("Order Number is : " + c5Name);
        String c6Name = c6.name;
        System.out.println("Order Name is : " + c6Name);
    }
}
