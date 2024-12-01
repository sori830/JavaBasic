import java.util.Scanner;

public class _04_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Name : ");
        String name = sc.next();
        System.out.println("Name : " + name);
        System.out.println("=============================");

        System.out.print("Enter an Age : ");
//        int age = Integer.parseInt(sc.next());
        int age = sc.nextInt();
        System.out.println("Age : " + age);
        System.out.println("=============================");

        sc.nextLine(); // ⚠️nextLine()의 역할

        System.out.print("How's your feels? : ");
        String feeling = sc.nextLine();
        System.out.println("Feeling is : " + feeling);
        System.out.println("=============================");
    }
}
