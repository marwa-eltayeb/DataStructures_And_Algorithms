package datastructuresandalgorithms.DataStructure.hash;

/**
 *
 * @author Marwa
 */
public class HashMapArray<T> {

    // Array of entries
    Entry[] arrayHash;
    // Size of elements
    int size;

    public HashMapArray(int size) {
        this.size = size;
        arrayHash = new Entry[size];
        for (int i = 0; i < size; i++) {
            // Initialize ebery element int the array
            arrayHash[i] = new Entry();
        }
    }

    int getHash(int key) {
        // Get the key and give them order by size
        return key % size;
    }

    public void put(int key, Object value) {
        // Get hash from the key
        int hashIndex = getHash(key);
        // The value of the hash index 
        Entry arrayValue = arrayHash[hashIndex];
        // Get the entry of the new item
        Entry newItem = new Entry(key, value);
        // refer to each other
        newItem.next = arrayValue.next;
        arrayValue.next = newItem;
    }

    public T get(int key) {
        // The value is unknown
        T value = null;
        // Get hash from the key
        int hashIndex = getHash(key);
        // The value of the hash index 
        Entry arrayValue = arrayHash[hashIndex];
        while (arrayValue != null) {
            if (arrayValue.getKey() == key) {
                // get the value from the array
                value = (T) arrayValue.getValue();
                break;
            }
            arrayValue = arrayValue.next;
        }
        // return the wanted value
        return value;
    }

}
