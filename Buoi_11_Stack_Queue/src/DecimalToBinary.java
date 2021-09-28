import java.util.Arrays;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 111;
        int soDu = 0;
        int soThuong = 0;
        Stack<Integer> stack = new Stack<>();
        String a = "";
        while (num != 0) {
            soDu = num % 2;
            soThuong = num / 2;
            num = soThuong;
            stack.push(soDu);
        }
        while (stack.size() != 0) {
            a += stack.pop();
        }
        System.out.println(a);
    }
}
