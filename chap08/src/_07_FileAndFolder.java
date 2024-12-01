import java.io.File;

public class _07_FileAndFolder {
    public static void main(String[] args) {
//        String folder = ".";
        String folder = "/Users/solhwi/Documents/JavaBasic/chap08/src";

        File fileAndFolders = new File(folder);
        System.out.println("current folder path : " + fileAndFolders.getAbsolutePath());

        for (File file : fileAndFolders.listFiles()) {
            if (file.isFile()) {
                System.out.println("(File) " + file.getName());
            }
            else if (file.isDirectory()) {
                System.out.println("(Folders) " + file.getName());
            }
        }
    }
}
