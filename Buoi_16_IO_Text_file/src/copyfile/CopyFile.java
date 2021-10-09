package copyfile;

import java.io.*;

public class CopyFile {
    public void copyFile(String sourceFilePath, String targetFilePath) throws IOException {
        File fileSource = new File(sourceFilePath);
        File fileTarget = new File(targetFilePath);

        InputStream inputStream = new FileInputStream(fileSource);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader reader = new BufferedReader(inputStreamReader);
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileTarget));

        String line = "";
        while ((line = reader.readLine()) != null) {
            writer.write(line + " ");
        }
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        CopyFile copyFile = new CopyFile();
        copyFile.copyFile("D:\\Codegym\\Module_2\\Buoi_16_IO_Text_file\\src\\copyfile\\source.txt", "D:\\Codegym\\Module_2\\Buoi_16_IO_Text_file\\src\\copyfile\\target.txt");
    }
}
