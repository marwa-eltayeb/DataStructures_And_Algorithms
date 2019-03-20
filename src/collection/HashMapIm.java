package collection;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Marwa
 */
public class HashMapIm {

    public static void main(String[] args) {

        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

        hashmap.put(20, "Amit");
        hashmap.put(21, "Vijay");
        hashmap.put(22, "Rahul");

        System.out.println(hashmap.get(20));
        
        // Read All data
        for (Map.Entry m : hashmap.entrySet()) {
            System.out.println("Key: " + m.getKey() + " " + "Value: " + m.getValue());
        }
        
        System.out.println("Remove One Element: " + hashmap.remove(20));
        
    }

}
