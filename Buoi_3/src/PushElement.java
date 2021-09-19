import java.util.Arrays;
import java.util.Scanner;

public class PushElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr_new = new int[6];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị muốn thêm: ");
        int num = scanner.nextInt();
        System.out.println("Nhập vị trí ");
        int index = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                arr_new[i] = num;
                arr_new[i + 1] = arr[i];
                i++;
            } else {
                arr_new[i] = arr[i];
            }
        }
        System.out.println("Mảng cũ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Mảng mới");
        System.out.println(Arrays.toString(arr_new));
    }
}
