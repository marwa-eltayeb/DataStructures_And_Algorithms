package datastructuresandalgorithms.DataStructure.hash;

/**
 *
 * @author Marwa
 */
public class Entry {

    int key;
    Object value;
    Entry next;

    public Entry(int key, Object value) {
        this.key = key;
        this.value = value;
        // There is no next element
        next = null;
    }

    // For Array
    public Entry() {
        next = null;
    }

    // Get key of the element
    public int getKey() {
        return key;
    }

    // Get value of the element
    public Object getValue() {
        return value;
    }

}
