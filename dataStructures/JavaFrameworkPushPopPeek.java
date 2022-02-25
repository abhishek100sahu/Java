package dataStructures;

import java.util.Stack;

public class JavaFrameworkPushPopPeek  {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(6);
        stack.push(4);

        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
