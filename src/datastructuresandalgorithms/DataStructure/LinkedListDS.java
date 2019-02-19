package datastructuresandalgorithms.DataStructure;

/**
 *
 * @author Marwa
 */
public class LinkedListDS<T> {

    // The first pointer
    Node head;

    public LinkedListDS() {
        // initialize it to null
        this.head = null;
    }

    public void add(Object value) {
        Node newNode = new Node(value,null);
        // if there is no node, 
        if (head == null) {
            // the newNode will be the head
            head = newNode;
        } else {
            // Make this new node refers to the head
            newNode.next = head;
            // Then the newNode will be the head
            head = newNode;
        }
    }

    public void delete() {
        // Make the head refer to the second element
        head = head.next;
    }

    public void display() {
        // Take the first pointer(head)
        Node node = head;
        // while there are nodes, print their values
        // It is at the end of the linked list 
        while (node != null) {
            System.out.println(node.value);
            // Move to the next node
            node = node.next;
        }
    }

}
