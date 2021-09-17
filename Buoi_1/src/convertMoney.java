import java.util.Scanner;

public class convertMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float vnd = 23000f;
        System.out.println("Nhập số tiền USD: ");
        float usd = scanner.nextFloat();
        float tien = usd*vnd;
        System.out.println("Chuyển sang tiền Việt là: " + tien);
    }
}
