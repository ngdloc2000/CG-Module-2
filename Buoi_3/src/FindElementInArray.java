import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        String name = scanner.nextLine();
        boolean check = false;

        for (int i = 0; i < students.length; i++) {
            if (name == students[i]) {
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Có trong mảng");
        } else {
            System.out.println("Không có trong mảng");
        }
    }
}
