import java.util.Scanner;

public class _Quiz_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("키를 입력해주세요 : ");
        int height = in.nextInt();

        System.out.println("키가 " + height + "cm 이므로 탑승 " + (height>=120?"가능합니다":"불가능합니다") );
    }
}
