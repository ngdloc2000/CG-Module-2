import java.util.Arrays;

public class ConcatArray {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5, 6};
        int[] a3 = new int[6];
        int pos = 0;

        for (int element : a1) {
            a3[pos] = element;
            pos++;
        }
        for (int element : a2) {
            a3[pos] = element;
            pos++;
        }
        System.out.println(Arrays.toString(a3));
    }
}
