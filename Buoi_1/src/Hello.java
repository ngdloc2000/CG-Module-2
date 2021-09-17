import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Enter your name");
        str = scanner.nextLine();
        System.out.println("Hello: " + str);
    }
}
