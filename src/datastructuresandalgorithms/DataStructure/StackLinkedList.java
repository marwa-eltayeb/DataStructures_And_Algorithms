package datastructuresandalgorithms.DataStructure;

/**
 *
 * @author Marwa
 */
public class StackLinkedList<T> {

    // The first pointer
    Node top;

    public StackLinkedList() {
        // initialize it to null
        this.top = null;
    }

    public void push(Object value) {
        Node newNode = new Node(value, null);
        // if there is no node, 
        if (top == null) {
            // the newNode will be the head
            top = newNode;
        } else {
            // Make this new node refers to the head
            newNode.next = top;
            // Then the newNode will be the head
            top = newNode;
        }
    }

    public T pop() {
        if (top == null) {
            System.out.println("stack is emplty");
            return null;
        }
        T value=(T) top.value;
        // Make the head refer to the second element
        top = top.next;
        return value;
    }

    public void display() {
        // Take the first pointer(head)
        Node node = top;
        // while there are nodes, print their values
        // It is at the end of the linked list 
        while (node != null) {
            System.out.println(node.value);
            // Move to the next node
            node = node.next;
        }
    }

}
