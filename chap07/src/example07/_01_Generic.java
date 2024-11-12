package example07;

public class _01_Generic {
    public static void main(String[] args) {
        int[] iArray = {1, 2, 3, 4, 5};
        double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);
    }

    private static void printIntArray(int[] iArray) {
        for (int i : iArray) {
            System.out.println(i + "");
        }
        System.out.println();
    }

    private static void printDoubleArray(double[] dArray) {
        for (double d : dArray) {
            System.out.println(d + "");
        }
        System.out.println();
    }

    private static void printStringArray(String[] sArray) {
        for (String s : sArray) {
            System.out.println(s + "");
        }
        System.out.println();
    }
}
