import java.io.*;

public class _08_ReadWriteFile {
    public static void main(String[] args) {
        // BufferedReader, BufferedWriter
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("goodjob.txt", true))) {
            bw.write("This is a good job.");
            bw.newLine();
            bw.write("good luck!!!");
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader br = new BufferedReader(new FileReader("goodjob.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
