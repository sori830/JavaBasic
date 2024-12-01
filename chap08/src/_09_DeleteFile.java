import java.io.File;

public class _09_DeleteFile {
    public static void main(String[] args) {
        File file = new File("test.txt");
        if (file.delete()) {
            System.out.println("Successfully deleted file : " + file.getName());
        } else {
            System.out.println("Failed to delete file : " + file.getName());
        }

        File folder = new File("A");
        if (folder.exists()) {
            if (folder.delete()) {
                System.out.println("Successfully deleted folder : " + folder.getAbsolutePath());
            } else {
                System.out.println("Failed to delete folder : " + folder.getAbsolutePath());
            }
        }
        if (deleteFolder(folder)) {
            if (folder.delete()) {
                System.out.println("Successfully deleted folder : " + folder.getAbsolutePath());
            } else {
                System.out.println("Failed to delete folder : " + folder.getAbsolutePath());
            }
        }
    }

    private static boolean deleteFolder(File folder) {
        if (folder.isDirectory()) {
            for (File file : folder.listFiles()) {
                deleteFolder(file);
            }
        }
        System.out.println("Delete target : " + folder.getAbsolutePath());
        return folder.delete();
    }

}
