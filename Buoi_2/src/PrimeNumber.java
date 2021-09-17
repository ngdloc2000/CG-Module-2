public class PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        int first = 2;


        while (count < 20) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(first); i++) {
                if (first % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;
                System.out.print(first + " ");
            }
            first++;
        }
    }
}
