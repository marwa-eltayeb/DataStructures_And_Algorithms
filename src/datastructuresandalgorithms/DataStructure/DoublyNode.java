package datastructuresandalgorithms.DataStructure;

/**
 *
 * @author Marwa
 */
public class DoublyNode {
    
    Object value;
    DoublyNode next;
    DoublyNode previous;
            
    public DoublyNode(Object value,DoublyNode next,DoublyNode previous){
        this.value = value;
        this.next = next;
        this.previous = previous;
    }
    
}
