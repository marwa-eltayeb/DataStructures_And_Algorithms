package algorithms.searching;


/**
 *
 * @author Marwa
 */
public class InterpolationSearch {

    public static void main(String[] args) {

        // Implement Binary Search using search Method
        int[] myNumbers = {45, 54, 53, 72, 84, 62};
        System.out.println(search(myNumbers, 34));
        
    }

    // Method for Binary Search
    static public String search(int[] array, int searchNumber) {
        int low = 0;
        int high = array.length - 1;
        int mid = 0;
        boolean isFound = false;
        while (!isFound) {
            if (low > high) {
                return "Number is not found";
            }

            mid = low + ((high - low) / 2);
            if (array[mid] == searchNumber) {
                return "Number is found";
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
