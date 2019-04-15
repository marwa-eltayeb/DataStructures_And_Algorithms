package algorithms.sorting;

/**
 *
 * @author Marwa
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] array = {4, 9, 7, 1, 3, 6, 5};
        selectionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            int index = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            
            if (index != i) {
                int temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }
        }
    }

}
