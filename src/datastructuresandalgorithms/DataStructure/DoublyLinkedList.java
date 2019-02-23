package datastructuresandalgorithms.DataStructure;

/**
 *
 * @author Marwa
 */
public class DoublyLinkedList<T> {
    
    // The first pointer
    DoublyNode head;

    public DoublyLinkedList() {
        // initialize it to null
        this.head = null;
    }
    
    public void add(Object value) {
        DoublyNode newNode = new DoublyNode(value,null,null);
        // if there is no node, 
        if (head == null) {
            // the newNode will be the head
            head = newNode;
        } else {
            // Make this new node refers to the head
            newNode.next = head;
            // The old head refers to the new node
            head.previous = newNode;
            // Then the newNode will be the head
            head = newNode;
        }
    }

    public void delete() {
        // Make the head refer to the second element
        head = head.next;
        // No data about the previous node
        head.previous = null;
    }

    public void display() {
        // Take the first pointer(head)
        DoublyNode node = head;
        // while there are nodes, print their values
        // It is at the end of the linked list 
        while (node != null) {
            System.out.println(node.value);
            // Move to the next node
            node = node.next;
        }
    }

    
}
