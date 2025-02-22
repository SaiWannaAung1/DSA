package dataStructure.stack;
import java.util.Stack;

public class StackExample{
    Stack<Integer> stack = new Stack<>();
    Stack<Stack<Integer>> history = new Stack<>();

    public void push(int item) {
        saveState();
        stack.push(item);
    }

    public Object pop() {
        saveState();
        if (!stack.isEmpty()) {
            return stack.pop();
        }
        return null;
    }
    private void saveState() {
        history.push((Stack<Integer>) stack.clone());
    }
    public void undo() {
        if (!history.isEmpty()) {
            stack.clear();
            stack.addAll(history.pop());
        } else {
            System.out.println("No actions to undo!");
        }
    }
    public static void main(String[] args) {
        StackExample stackExample = new StackExample();
        stackExample.push(1);
        stackExample.push(2);
        stackExample.push(3);
        stackExample.push(4);
        System.out.println("Get all value "+ stackExample);
//        System.out.println("Peek "+ stackExample.peek());
        System.out.println("Get all value "+ stackExample);
        stackExample.pop();
        System.out.println("Get all value "+ stackExample);
        stackExample.undo();
        System.out.println("Get all value "+ stackExample);
    }



    @Override
    public String toString() {
        return "StackExample{" +
                "stack=" + stack +
                '}';
    }
}
