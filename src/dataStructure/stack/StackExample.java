package dataStructure.stack;
import java.util.Stack;

public class StackExample{
    Stack<Integer> stack = new Stack<>();
    Stack<Stack<Integer>> history = new Stack<>();

    public void push(int item) {
        saveState();  // Save the current state before pushing
        stack.push(item);  // Push the item onto the stack
    }

    public Object pop() {
        saveState();  // Save the current state before popping
        if (!stack.isEmpty()) {
            return stack.pop();  // Pop the item from the stack
        }
        return null;
    }
    private void saveState() {
        history.push((Stack<Integer>) stack.clone());  // Save a clone of the current stack
    }
    public void undo() {
        if (!history.isEmpty()) {
            stack.clear();
            stack.addAll(history.pop());// Restore the previous state from the history stack
        } else {
            System.out.println("No actions to undo!");  // Handle case when there's no history
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

    private static void undo(Stack<Integer> actionStack){

    }

    @Override
    public String toString() {
        return "StackExample{" +
                "stack=" + stack +
                '}';
    }
}
