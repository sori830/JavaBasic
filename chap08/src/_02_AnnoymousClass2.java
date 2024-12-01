abstract class HomeMadeBurger {
    public abstract void cook();
}

public class _02_AnnoymousClass2 {
    public static void main(String[] args) {
        HomeMadeBurger momMadeBurger = getMomMadeBurger();
        momMadeBurger.cook();
        System.out.println("=============================");

        HomeMadeBurger broMadeBurger = getBroMadeBurger();
        broMadeBurger.cook();
        System.out.println("=============================");
    }

    private static HomeMadeBurger getBroMadeBurger() {
        return new HomeMadeBurger() { // static 이므로 return값이 있어야 함!
            @Override
            public void cook() {
                System.out.println("broMadeBurger");
            }
        };
    }

    public static HomeMadeBurger getMomMadeBurger() {
        return new HomeMadeBurger() { // static 이므로 return값이 있어야 함!
            @Override
            public void cook() {
                System.out.println("momMadeBurger");
            }
        };
    }
}
