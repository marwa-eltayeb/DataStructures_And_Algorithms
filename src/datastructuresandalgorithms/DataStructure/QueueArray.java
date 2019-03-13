package datastructuresandalgorithms.DataStructure;

/**
 *
 * @author Marwa
 */
public class QueueArray<T> {

    Object[] arrayQueue;
    int size;
    public int front; // First added item
    public int rear; // Last added item

    public QueueArray(int size) {
        this.size = size; //6
        arrayQueue = new Object[this.size];
        front = -1;
        rear = -1;
    }

    public void queue(Object newItem) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = rear + 1;  // 0
        // Set index to new value
        arrayQueue[rear] = newItem;
        if (front == -1) {
            // front refers to first item.
            front = 0;
        }
    }

    public T deQueue() {
        if (isEmplty()) {
            System.out.println("Queue is empty");
            return null;
        }
        T objectOut = (T) arrayQueue[front]; // 0 remove first item
        front = front + 1; // 1 front refers to second item
        return objectOut; // return the removed item
    }

    // If Queue is full
    public Boolean isFull() {
        return (rear == size - 1); // 5 = 5
    }

    // If Queue is empty
    public Boolean isEmplty() {
        return (front == -1 || front > rear); // front > 5
    }
}
