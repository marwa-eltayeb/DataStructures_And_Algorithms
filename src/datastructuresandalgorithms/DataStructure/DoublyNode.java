package datastructuresandalgorithms.DataStructure;

/**
 *
 * @author Marwa
 */
public class DoublyNode<T> {
    
    T value;
    DoublyNode next;
    DoublyNode previous;
            
    public DoublyNode(T value,DoublyNode next,DoublyNode previous){
        this.value = value;
        this.next = next;
        this.previous = previous;
    }
    
}
