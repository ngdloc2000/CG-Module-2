public class FindMinimum_2 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3}, {4,5,6}, {7,8,9}
        };
        int min = arr[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println(min);
    }
}
