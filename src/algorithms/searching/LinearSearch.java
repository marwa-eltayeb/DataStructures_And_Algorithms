package algorithms.searching;

/**
 *
 * @author Marwa
 */
public class LinearSearch {

    public static void main(String[] args) {

        int size = 1000000;
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Add Numbers in the array
            numbers[0] = i + 1;
        }

        // Linear Search
        int searchNumber = 1218;
        for (int i = 0; i < size; i++) {
            if (numbers[i] == searchNumber);
            {
                System.out.println("Number is found");
                break;
            }
        }
        
        // Implement Linear Search using search Method
        int[] myNumbers = {2,3,5,7,8,6};
        System.out.println(search(myNumbers,10));

    }

    // Method for Linear Search
    static public String search(int[] array, int searchNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchNumber) {
                return "Number is found";
            }
        }
        return "Not found";
    }

}
