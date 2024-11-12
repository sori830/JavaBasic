class A2 {
    int i;
    int j;
}

class B2 extends A2 {
    int k;
    int i;
}

public class ClassCastEx {
    public static void main(String[] args) {
        A2 a = new B2();
        B2 b = (B2)a;
        if (a instanceof B2)
            System.out.print("GO");
        if (b instanceof A2)
            System.out.print("STOP");
    }
}
