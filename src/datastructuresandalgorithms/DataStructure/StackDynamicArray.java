package datastructuresandalgorithms.DataStructure;

import java.util.Arrays;

/**
 *
 * @author Marwa
 */
public class StackDynamicArray<T> {

    // Size of the array
    int size;

    public int top;
    // Array of Object
    Object[] arrayStack;

    public StackDynamicArray(int size) {
        // Number of elements added
        this.size = size;
        // Initialize array size to this size
        arrayStack = new Object[this.size];
        // top does not refer to any thing
        top = -1;
    }

    // Add an item
    public void push(Object newItem) {

        checkCapacity(top + 2);
        // Add an item
        top = top + 1;
        // Set index of stack to new item
        arrayStack[top] = newItem;
    }

    // If stack is full
    public Boolean isFull() {
        // top equals size of the array (the last element)
        return (top == size - 1);
    }

    // If minimum Capacity greater than old capacity, multibly the length of the old capacity.
    public void checkCapacity(int minCapacity) {
        // Store length of the array in this variable 
        int oldCapacity = arrayStack.length;
        if (minCapacity > oldCapacity) {
            // Multibly the length
            int newCapacity = oldCapacity * 2;
            // Set newCapacity to minCapacity
            if (newCapacity < minCapacity) { //delete
                newCapacity = minCapacity;
            }
            // original data: the array to be copied
            // newCapacity: the length of the copy to be returned
            // Copy original data and set a new length
            arrayStack = Arrays.copyOf(arrayStack, newCapacity);
        }
    }

    // delete an item
    public T pop() {

        if (isEmpty()) {
            System.out.println("stack is empty");
            return null;
        }

        // Item equals the last item int the stack
        T item = (T) arrayStack[top];
        // Delete an item
        top = top - 1;
        return item;
    }

    // If stack is empty
    public Boolean isEmpty() {
        return (top == -1);
    }

    // Get size
    public int getSize() {
        return arrayStack.length;
    }

}
