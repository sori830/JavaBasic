/*
    예제 6-3 : Point 클래스에 equals() 작성
    - Point 클래스에 두 점의 좌표가 같으면 true를 리턴하는 equals() 작성
 */

class _03_Point {
    private int x, y;
    public _03_Point(int x, int y) {
        this.x = x; this.y = y;
    }
    public boolean equals(Object obj) {
        _03_Point p = (_03_Point)obj;
        if(x == p.x && y == p.y)
            return true;
        else return false;
    }
}

public class EqualsEx {
    public static void main(String[] args) {
        _03_Point a1 = new _03_Point(2,3);
        _03_Point b1 = new _03_Point(2,3);
        _03_Point c1 = a1;

        if (a1 == b1)
            System.out.println("a1==b1");
        if (a1 == c1)
            System.out.println("a1==c1");

        _03_Point a2 = new _03_Point(2,3);
        _03_Point b2 = new _03_Point(2,3);
        _03_Point c2 = new _03_Point(3,4);

        if (a2 == b2)
            System.out.println("a2==b2");
        if(a2.equals(b2))
            System.out.println("a2 is equal to b2");
        if(a2.equals(c2))
            System.out.println("a2 is equal to c2");
    }
}
