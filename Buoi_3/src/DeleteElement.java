import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần xóa: ");
        int input = scanner.nextInt();
        int[] arr = {1, 2, 3, 4, 5};
        int index_del = indexElement(input, arr);
        int n = arr.length-1;

        for (int i = index_del; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
            n--;
        }
        arr[arr.length-1] = 0;
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int indexElement(int num_del, int[] arr) {
        int index_del = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num_del) {
                index_del = i;
                break;
            }
        }
        return index_del;
    }

}
