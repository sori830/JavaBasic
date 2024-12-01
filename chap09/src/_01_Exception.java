public class _01_Exception {
    public static void main(String[] args) {
        try {
            Object obj = "test";
            System.out.println((int)obj);
        } catch (Exception e) {
            System.out.println("Exception Handler" + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Program Terminate!!!");
    }
}
