package tinhtong_docfile;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFile(String fileName) throws IOException {
        // Khai báo đối tượng file
        File file = new File(fileName);
        // Tạo 1 dòng kết nối với file
        InputStream inputStream = new FileInputStream(file);
        // Tọa 1 đối tượng đọc file với dòng trên
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        // Tạo 1 đối tượng bộ đệm
        BufferedReader reader = new BufferedReader(inputStreamReader);

        String line = "";
        int sum = 0;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            sum += Integer.parseInt(line);
        }
        System.out.println("Tổng = " + sum);
    }

    public static void main(String[] args) throws IOException {
        try {
            System.out.println("Nhập đường dẫn file: ");
            Scanner scanner = new Scanner(System.in);
            String path = scanner.nextLine();

            ReadFileExample readfileEx = new ReadFileExample();
            readfileEx.readFile(path);
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không tìm thấy file");
        }
    }
}
