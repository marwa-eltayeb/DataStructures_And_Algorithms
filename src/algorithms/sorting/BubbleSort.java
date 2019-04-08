package algorithms.sorting;

/**
 *
 * @author Marwa
 */
public class BubbleSort {

    public static void main(String[] args) {
        
        // Implement Bubble Sort
        int[] array = {1, 50, 30, 10, 60, 80};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
    
    public static void bubbleSort(int[] array) {
        int n = array.length;
        int temp = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                // If first elemnt is greater than second element, swap              
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    
    
    

}
