package test08;

public class _02_GenericClass04 {
    public static void main(String[] args) {

        System.out.println("=========================================");
        orderCoffee("Elise");
        orderCoffee(36);

        System.out.println("=========================================");
        orderCoffee("Lee", "Americano");
        orderCoffee(37, "Americano");
    }

    public static <T> void orderCoffee(T name) {
        System.out.println("coffee is ready : " + name);
    }

    public static <T> void orderCoffee(T number, T name) {

    }
}
