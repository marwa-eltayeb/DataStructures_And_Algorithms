package algorithms.searching;

import static algorithms.searching.LinearSearch.search;

/**
 *
 * @author Marwa
 */
public class BinarySearch {

    public static void main(String[] args) {

        int size = 1000000;
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Add Numbers to the array
            numbers[i] = i + 1;
        }

        // Binary Search
        int searchNumber = 1278;
        int numberOfTries = 0;
        int low = 0;
        int high = numbers.length - 1;
        int mid = 0;
        boolean isFound = false;
        while (!isFound) {

            if (low > high) {
                System.out.println("Number not found");
                break;
            }

            mid = low + ((high - low) / 2);
            numberOfTries++;
            if (numbers[mid] == searchNumber) {
                System.out.println("Number is found after: " + numberOfTries + " try");
                break;
            }

            if (numbers[mid] < searchNumber) {
                low = mid + 1;
            }

            if (numbers[mid] > searchNumber) {
                high = mid - 1;
            }
        }

        // Implement Binary Search using search Method
        int[] myNumbers = {23, 34, 53, 72, 84, 62};
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
