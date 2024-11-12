interface MouseDriver {
    final int BUTTONS = 3;
//    int VERSION;  // -> 초기화 필요!!
    void move();
    public int click();
//    protected int out();  // -> 인터페이스에서는 public만 사용 가능
//    static public void drag();  // -> 인터페이스에서 static 메서드는 본문을 추가해야 함!
    default void drop() {
        System.out.println("drop");
    }
}
