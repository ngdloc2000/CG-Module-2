package triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle t = new Triangle();
        int choice;

        do {
            System.out.println("Chào bạn");
            System.out.println("1. Nhập thông tin tam giác");
            System.out.println("2. In thông tin");
            System.out.println("0. Thoát");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    t.nhap();
                    break;
                case 2:
                    System.out.println(t.toString());
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}
