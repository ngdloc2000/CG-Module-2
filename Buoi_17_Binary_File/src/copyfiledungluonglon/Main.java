package copyfiledungluonglon;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) throws IOException {
        File sourceFile = new File("D:\\Codegym\\Module_2\\Buoi_17_Binary_File\\src\\copyfiledungluonglon\\source.txt");
        File destFile = new File("D:\\Codegym\\Module_2\\Buoi_17_Binary_File\\src\\copyfiledungluonglon\\target.txt");

//        copyFileUsingJava7Files(sourceFile, destFile);
        copyFileUsingStream(sourceFile, destFile);
    }
}
