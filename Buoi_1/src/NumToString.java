import java.util.Scanner;


public class NumToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("Nhập số: ");
        num = scanner.nextInt();
        System.out.println(convert(num));
    }

    static String convert(int n) {
        String[] hangChuc = {"", " ten", " twenty", " thirty", " forty", " fifty", " sixty", " seventy", " eighty", " ninety"};
        String[] nhoHon20 = {"", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine", " ten", " eleven", " tưelve",
                " thirteen", "fouteen", "fifteen", " sixteen", " seventeen", " eighteen", " nineteen"};
        String str;
        if (n % 100 <= 20) {
            str = nhoHon20[n % 100];
            n /= 100;
        } else {
            str = nhoHon20[n % 10];
            n /= 10;
            str = hangChuc[n % 10] + str;
            n /= 10;
        }
        if (n == 0) return str;
        else
            return nhoHon20[n] + " hundred" + str;
    }
}

