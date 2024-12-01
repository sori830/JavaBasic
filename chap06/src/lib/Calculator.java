package lib;

public abstract class Calculator { // 다른 패키지의 클래스에서 접근할 수 있도록 public으로 지정
    public abstract int add(int a, int b);
    public abstract int subtract(int a, int b);
    public abstract double average(int[] a);
}
