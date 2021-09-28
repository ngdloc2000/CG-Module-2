package ReverseArray.src;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArrayTest {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        Stack<Integer> stack2 = new Stack<>();
        int temp = 0;
        for (int i = 0; i < 5; i++) {
            temp = stack1.pop();
            stack2.push(temp);
        }
        System.out.println(stack2);
    }
}
