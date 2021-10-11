package copynhiphan;

import java.io.*;

public class Main {
    public static void copyFile(File source, File target) throws IOException {
        FileInputStream inputStream = new FileInputStream(source);
        FileOutputStream outputStream = new FileOutputStream(target);
        DataOutputStream dos = new DataOutputStream(outputStream);

        int line;
        while ((line = inputStream.read()) != -1) {
            dos.writeInt(line);
            System.out.println(line);
        }
        outputStream.close();
    }

    public static void main(String[] args) throws IOException {
        File source = new File("D:\\Codegym\\Module_2\\Buoi_17_Binary_File\\src\\copynhiphan\\source.txt");
        File target = new File("D:\\Codegym\\Module_2\\Buoi_17_Binary_File\\src\\copynhiphan\\target.txt");
        copyFile(source, target);
    }
}
