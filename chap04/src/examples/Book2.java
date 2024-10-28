/**
 * [예제 4-5 : this()로 다른 생성자 호출]
 */

package examples;

// Book 클래스의 생성자를 this()를 이용하여 수정!↓↓↓↓↓
//public class Book {
//    String title;
//    String author;
//
//    public Book(String t) { // 생성자1 (매개 변수 t)
//        title = t; author = "작자미상";
//    }
//
//    public Book(String t, String a) { // 생성자2 (매개 변수 t, a)
//        title = t; author = a;
//    }
//
//    public static void main(String[] args) {
//        Book littlePrince = new Book("어린왕자", "생텍쥐페리"); // 매개 변수 두 개 (생성자2 호출)
//        Book loveStory = new Book("춘향전"); // 매개 변수 한 개
//        System.out.println(littlePrince.title + " " + littlePrince.author);
//        System.out.println(loveStory.title + " " + loveStory.author);
//    }
//}

// this()를 이용하여 수정한 결과!
public class Book2 {
    String title;
    String author;
    void show() {
        System.out.println(title + " " + author);
    }

    public Book2() { // 생성자1
        this("", "");
        System.out.println("생성자 호출됨");
    }

    public Book2(String title) { // 생성자2
        this(title, "작가미상"); // 생성자3 호출
    }

    public Book2(String title, String author) { // 생성자3
        this.title = title; this.author = author;
    }

    public static void main(String[] args) {
        Book2 littlePrince = new Book2("어린왕자", "생텍쥐페리"); // 생성자3 호출
        Book2 loveStory = new Book2("춘향전"); // 생성자2 호출
        Book2 emptyBook = new Book2(); // 생성자1 호출 -> "생성자 호출됨" 출력
        loveStory.show(); // 객체 loveStory의 title과 author 출력 (춘향전 작가미상)
    }
}
