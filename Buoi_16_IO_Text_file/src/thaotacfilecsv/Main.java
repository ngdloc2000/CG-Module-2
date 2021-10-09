package thaotacfilecsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitDataArray = csvLine.split(",");
            for (int i = 0; i < splitDataArray.length; i++) {
                result.add(splitDataArray[i]);
            }
        }
        return result;
    }

    private static void printCountry(List<String> country) {
        System.out.println(
                "Country [id= "
                        + country.get(0)
                        + ", code= " + country.get(1)
                        + " , name=" + country.get(2)
                        + "]");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("D:\\Codegym\\Module_2\\Buoi_16_IO_Text_file\\src\\thaotacfilecsv\\country.csv"));
        String line = "";
        while ((line = reader.readLine()) != null) {
            printCountry(parseCsvLine(line));
        }
    }
}
