package dataStructure.collection;

public class Stack {
    private int arr[];
    private int top;
    private int capacity;
    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop();
        System.out.println("\nAfter popping out");

        stack.printStack();
    }
    public int pop() {
        if (isEmpty()){
            System.exit(1);
        }
        return arr[top--];
    }
    public void push(int x) {
        if (isFull()) {
            System.out.println("OverFlow\nProgram Terminated\n");
            System.exit(1);
        }

        System.out.println("Inserting " + x);
        arr[++top] = x;
    }
    public Boolean isFull() {
        return top == capacity - 1;
    }
    public int size() {
        return top + 1;
    }
    public Boolean isEmpty() {
        return top == -1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }

}
