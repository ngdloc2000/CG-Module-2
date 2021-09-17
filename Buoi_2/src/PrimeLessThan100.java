public class PrimeLessThan100 {
    public static void main(String[] args) {
        int first = 2;
        while (first < 100) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(first); i++) {

                if (first % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(first + " ");
            }
            first++;

        }

    }
}

