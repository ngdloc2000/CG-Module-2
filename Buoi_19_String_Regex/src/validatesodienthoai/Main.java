package validatesodienthoai;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Pattern pattern = Pattern.compile("^\\(\\d{2}\\)-\\(0{1}\\d{9}\\)$");
        Matcher matcher = pattern.matcher(name);
        if (matcher.find()) {
            System.out.println("Đúng");
        } else {
            System.out.println("Sai");
        }
    }
}
