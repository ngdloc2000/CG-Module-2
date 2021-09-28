import java.util.LinkedList;
import java.util.Queue;

public class Palindrome {
    public static void main(String[] args) {
        String str = "able was I ere I saw elba";
        String str_new = "";
        Queue<Character> queue = new LinkedList<>();

        for (int i = str.length() - 1; i >= 0; i--) {
            queue.add(str.charAt(i));
        }

        while (!queue.isEmpty()) {
            str_new += queue.remove();
        }
        if (str_new.equals(str)) {
            System.out.println("Đúng");
        } else System.out.println("Sai");
    }
}
