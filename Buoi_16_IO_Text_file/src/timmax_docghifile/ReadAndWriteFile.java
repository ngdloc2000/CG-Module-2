package timmax_docghifile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String fileName) throws IOException {
        List<Integer> numbers = new ArrayList<>();

        File file = new File(fileName);
        InputStream inputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            numbers.add(Integer.parseInt(line));
        }
        bufferedReader.close();
        return numbers;
    }

    public void writeFile(String filePath, int max) throws IOException {
        FileWriter writer = new FileWriter(filePath, true);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write("Giá trị lớn nhất là: " + max);
        bufferedWriter.close();
    }

    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\Codegym\\Module_2\\Buoi_16_IO_Text_file\\src\\timmax_docghifile\\numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("D:\\Codegym\\Module_2\\Buoi_16_IO_Text_file\\src\\timmax_docghifile\\result.txt", maxValue);
    }
}
