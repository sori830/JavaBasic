import java.util.Scanner;

public class _Quiz_03 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("주민등록번호를 입력해주세요 : ");
        String idNum = in.next();
        String idCut = idNum.substring(0,8);

        System.out.println(idCut);
    }
}
