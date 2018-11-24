package datastructuresandalgorithms.DataStructure;

import java.util.Arrays;

/**
 *
 * @author Marwa
 */
public class DynamicArray<T> {
    
    Object data[];
    int size;
    
    public DynamicArray(){
        // Number of elements added
        this.size = 0;
        // Initialize array size to 1
        data = new Object[1];
    }
    
    // Return size of the array
    public int getSize(){
        return data.length;
    }
            
    // Get element
    public T get(int index){
        return (T) data[index];
    }
    
    // Add element
    public void add(int element){
        // If my new size greater than the defined size, increase it
        // If my new size less than the defined size, do nothing
        checkCapacity(size + 1);
        // Assign the new index to teh new value.
        data[size++] = element; 
    }
    
    // If minimum Capacity greater than old capacity, multibly the length of the old capacity.
    public void checkCapacity(int minCapacity){
        // Store length of the array in this variable 
        int oldCapacity = data.length;
        if(minCapacity > oldCapacity){
            // Multibly the length
            int newCapacity = oldCapacity * 2;
            // Set newCapacity to minCapacity
            if(newCapacity < minCapacity){ //delete
                newCapacity = minCapacity;
            }
            // original data: the array to be copied
            // newCapacity: the length of the copy to be returned
            // Copy original data and set a new length
            data = Arrays.copyOf(data, newCapacity);
        }   
    }
    
}
