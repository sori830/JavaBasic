/*
    예제 6-6 : 박싱 언박싱
 */

public class AutoBoxingUnBoxingEx {
    public static void main(String[] args) {
        int n = 10;
        Integer intObject = n; // auto boxing
//         Integer intObject = Integer.valueOf(n);
        System.out.println("intObject = " + intObject);

        int m = intObject + 10; // auto unboxing
//         int m = intObject.intValue() + 10;
        System.out.println("m = " + m);
    }
}
