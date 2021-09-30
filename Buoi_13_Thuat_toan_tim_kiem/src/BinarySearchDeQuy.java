public class BinarySearchDeQuy {
    public static int binarySearch(int[] array, int left, int right, int value) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (value < array[mid]) {
//                right = mid - 1;
                return binarySearch(array, left, mid - 1, value);
            } else if (value == array[mid]) {
                return mid;
            } else {
//                left = mid + 1;
                return binarySearch(array, mid + 1, right, value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(binarySearch(a, 0, 4, 1));
    }
}
