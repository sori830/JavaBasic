class MyFileWriter implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("FileWriter closed");
    }

    public void write(String line) {
        System.out.println("Input");
        System.out.println("Contents : " + line);
    }
}

public class _05_Exception {
    public static void main(String[] args) {
        MyFileWriter writer1 = null;
        try {
            writer1 = new MyFileWriter();
            writer1.write("Writing to file");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer1.close();
            } catch (Exception e) {
                throw new RuntimeException();
            }
        }
        System.out.println("=================================");
        try (MyFileWriter writer2 = new MyFileWriter()) {
            writer2.write("Writing to file");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
