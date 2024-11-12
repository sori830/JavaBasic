/*
    예제 5-5 활용 : 링크드 리스트로 도형 생성하여 연결
 */
package examples;

public class UsingOverride {
    public static void main(String[] args) {
        Shape start, last, obj;
        /*
          start: 리스트의 시작(헤드)을 가리키는 변수입니다. 첫 번째 객체를 가리킵니다.
          last: 리스트의 끝을 가리키는 변수입니다. 현재 추가되는 마지막 객체를 가리킵니다.
          obj: 새로운 Shape 객체를 생성할 때 사용하는 임시 변수입니다.
         */

        // 링크드 리스트로 도형 생성하여 연결

        // 1. Line 객체 연결
        start = new Line(); // Line 객체 생성
        last = start; // -> start와 last가 line을 가리키도록 함
        // 리스트 상태 : start -> Line

        // 2. Rect 객체 연결
        obj = new Rect(); // Rect 객체 생성
        last.next = obj; // Line 객체의 next가 Rect를 가리키도록 연결
        last = obj; // last가 Rect 객체를 가리키도록 업데이트
        // 리스트 상태 : start -> Line -> Rect

        // 3. Line 객체 연결
        obj = new Line(); // Line 객체 생성
        last.next = obj; // Rect 객체의 next가 새로운 Line 객체를 가리키도록 연결
        last = obj; // last가 새로운 Line 객체를 가리키도록 업데이트
        // 리스트 상태 : start -> Line -> Rect -> Line

        // 4. Circle 객체 연결
        obj = new Circle(); // Circle 객체 생성
        last.next = obj; // Line 객체의 next가 Circle 객체를 갸리키도록 연결
        // 리스트 상태 : start -> Line -> Rect -> Line -> Circle

        // 모든 도형 출력
        Shape p = start; // p는 start에서 시작해 각 노드를 순차적으로 따라가며 draw()를 호출
        while(p != null) {
            p.draw();
            p = p.next;
        }
    }
}