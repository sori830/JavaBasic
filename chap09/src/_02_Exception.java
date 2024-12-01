public class _02_Exception {
    public static void main(String[] args) {
        try {
            System.out.println(3/0);
            int[] arr = new int[3];
            arr[5] = 1;
            Object obj = "test";
            System.out.println((int)obj);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (ClassCastException e) {
            System.out.println("ClassCastException");
        } catch (Exception e) {
            System.out.println("Exception Handler" + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Program Terminate!!!");
    }
}
