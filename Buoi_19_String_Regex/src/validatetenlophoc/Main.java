package validatetenlophoc;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Pattern pattern = Pattern.compile("^[C|A|P]\\d{4}[G|H|I|K|L|M]$");
        Matcher matcher = pattern.matcher(name);
        if (matcher.find()) {
            System.out.println("Đúng");
        } else {
            System.out.println("Sai");
        }
    }
}
