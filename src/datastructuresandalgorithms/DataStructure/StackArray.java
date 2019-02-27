package datastructuresandalgorithms.DataStructure;

/**
 *
 * @author Marwa
 */
public class StackArray<T> {

    // Size of the array
    int size;

    public int top;
    // Array of Object
    Object[] ArrayStack;

    public StackArray(int size) {
        // Number of elements added
        this.size = size;
        // Initialize array size to this size
        ArrayStack = new Object[this.size];
        // top does not refer to any thing
        top = -1;
    }

    // Add an item
    public void push(Object newItem) {

        if (isFull()) {
            System.out.println("stack is full");
            // Do not add
            return;
        }

        // Add an item
        top = top + 1;
        // Set index of stack to new item
        ArrayStack[top] = newItem;
    }

    // If stack is full
    public Boolean isFull() {
        // top equals size of the array (the last element)
        return (top == size - 1);
    }

    // delete an item
    public T pop() {

        if (isEmpty()) {
            System.out.println("stack is empty");
            return null;
        }

        // Item equals the last item int the stack
        T item = (T) ArrayStack[top];
        // Delete an item
        top = top - 1;
        return item;
    }

    // If stack is empty
    public Boolean isEmpty() {
        return (top == -1);
    }

}
