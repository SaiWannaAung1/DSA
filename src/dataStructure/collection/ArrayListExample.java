package dataStructure.collection;

import java.util.ArrayList;
import java.util.Stack;

public class ArrayListExample<T> extends ArrayList<T> {
    private Stack<ArrayList<T>> history = new Stack<>();

    @Override
    public boolean add(T element) {
        saveState();  // Save the current state before modification
        return super.add(element);
    }

    @Override
    public T remove(int index) {
        saveState();
        return super.remove(index);
    }

    public void undo() {
        if (!history.isEmpty()) {
            this.clear();
            this.addAll(history.pop()); // Restore previous state
        } else {
            System.out.println("No actions to undo!");
        }
    }

    private void saveState() {
        history.push(new ArrayList<>(this)); // Save a copy of the current state
    }
    public static void main(String[] args) {
        ArrayListExample<String> list = new ArrayListExample<>();
        list.add("smith");
        list.add("john");
        list.add("william");

        System.out.println("List before removal: " + list);
        list.remove(1);
        System.out.println("List after removal: " + list);
        list.undo();  // Undo last action
        System.out.println("List after undo: " + list);
    }
}
