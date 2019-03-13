package datastructuresandalgorithms.DataStructure;

/**
 *
 * @author Marwa
 */
public class QueueLinkedList<T> {

    // The first pointer
    DoublyNode<T> front;
    DoublyNode<T> rear;

    public QueueLinkedList() {
        // initialize them to null
        front = null;
        rear = null;
    }

    public void enQueue(Object value) {
        DoublyNode newNode = new DoublyNode(value, null, null);
        // if there is no node,
        if (rear == null || front == null) {
            // the newNode will be the front
            front = newNode;
            // the newNode will be the rear
            rear = newNode;
        } else {
            // Next of new Node refers to null
            newNode.next = null;
            // The old node refers to the rear
            newNode.previous = rear;
            // Make this rear refers to the new node
            rear.next = newNode;
            // Then the rear will be the new Node
            rear = newNode;
        }
    }

    public T deQueue() {
        if (rear == null || front == null) {
            System.out.println("Queue is empty");
            return null;
        }
        // The deleted value
        T value = (T) front.value;
        // Make the front refer to the second element
        front = front.next;
        if (front != null) {
            // No data about the previous node
            front.previous = null;
        }
        return value;
    }

    boolean isEmpty() {
        return front == null;
    }

}
