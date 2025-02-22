package dataStructure.stack;
import java.util.Stack;

public class StackExample {
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Get all value "+ stack);
        System.out.println("Peek "+ stack.peek());
        System.out.println("Get all value "+ stack);
        System.out.println("Remove Last Item "+ stack.pop());
        System.out.println("Get all value "+ stack);
    }
}
