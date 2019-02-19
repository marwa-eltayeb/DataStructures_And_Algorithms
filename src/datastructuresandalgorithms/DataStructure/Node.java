package datastructuresandalgorithms.DataStructure;

/**
 *
 * @author Marwa
 */
public class Node<T> {
    
    T value;
    Node next;
    
    public Node(T value,Node next){
        this.value = value;
        this.next = next;
    }
}
