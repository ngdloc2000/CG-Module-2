import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int temp = 0;
        int first = 0;
        int last = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        while (first <last) {
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }

        for (int i: arr) {
            System.out.println(i);
        }
    }
}
