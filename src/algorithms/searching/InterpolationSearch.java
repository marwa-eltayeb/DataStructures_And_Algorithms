package algorithms.searching;

/**
 *
 * @author Marwa
 */
public class InterpolationSearch {

    public static void main(String[] args) {

        int size = 1000000;
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Add Numbers to the array
            numbers[i] = i + 1;
        }
        
        // Implement Interpolation Search using search Method
        System.out.println(search(numbers, 999999));

    }

    // Method for Interpolation Search
    static public String search(int[] array, int searchNumber) {
        int low = 0;
        int high = array.length - 1;
        int mid = 0;
        int numberOfTries = 0;
        boolean isFound = false;
        while (!isFound) {
            if (low > high) {
                return "Number is not found";
            }

            numberOfTries++;
            mid = low + ((high - low) / (array[high] - array[low])) * (searchNumber - array[low]);
            if (array[mid] == searchNumber) {
                return "Number is found after " + numberOfTries + " try";
            }

            if (array[mid] < searchNumber) {
                low = mid + 1;
            }

            if (array[mid] > searchNumber) {
                high = mid - 1;
            }
        }
        return "";
    }

}
