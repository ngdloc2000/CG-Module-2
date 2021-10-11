package copynhiphan;

import java.io.*;

public class Main {
    public static void copyFile(File source, File target) throws IOException {
        InputStream inputStream = new FileInputStream(source);
        OutputStream outputStream = new FileOutputStream(target);

        int line;
        while ((line = inputStream.read()) != -1) {
            outputStream.write((char) line);
        }
        outputStream.close();
    }

    public static void main(String[] args) throws IOException {
        File source = new File("D:\\Codegym\\Module_2\\Buoi_17_Binary_File\\src\\copynhiphan\\source.txt");
        File target = new File("D:\\Codegym\\Module_2\\Buoi_17_Binary_File\\src\\copynhiphan\\target.txt");
        copyFile(source, target);
    }
}
