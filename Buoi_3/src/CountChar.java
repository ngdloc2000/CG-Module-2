import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        String str = "nguyendinhloc";
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);

        for (int i = 0; i<str.length();i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
