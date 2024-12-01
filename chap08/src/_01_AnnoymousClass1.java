class Coffee {
    public void order(String coffee) {
        System.out.println("주문하신 " + coffee + " 나왔습니다.");
    }

    public void clean() {
        System.out.println("드신 자리는 치워주세요.");
    }
}

public class _01_AnnoymousClass1 {
    public static void main(String[] args) {
        Coffee c1 = new Coffee();
        c1.order("아메리카노");
        c1.clean();
        System.out.println("=============================");

        Coffee c2 = new Coffee();
        c2.order("라떼");
        c2.clean();
        System.out.println("=============================");

        // 익명클래스
        Coffee specialCoffee = new Coffee() {
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("(귓속말) 딸기 케이크는 서비스입니다.");
            }

            @Override
            public void clean() {
                System.out.println("(귓속말) 드신 자리는 그대로 놔두세요.");
            }
        };

        specialCoffee.order("바닐라라떼");
        specialCoffee.clean();
        System.out.println("=============================");
    }
}
