package test08;

import test07.coffee.CoffeeByNumber;
import test07.coffee.CoffeeByNickName;

public class _01_GenericClass {
    public static void main(String[] args) {
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();
        CoffeeByNickName c2 = new CoffeeByNickName("LEE");
        c2.ready();
    }
}
