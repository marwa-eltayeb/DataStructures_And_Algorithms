package datastructuresandalgorithms;

import datastructuresandalgorithms.DataStructure.hash.HashMapArray;

/**
 *
 * @author Marwa
 */
public class HashMapArrayDemo {

    public static void main(String[] args) {
        
        HashMapArray<String> hm = new HashMapArray<String>(10);
        hm.put(1, "Lara");
        hm.put(2, "Hana");
        hm.put(3, "Nora");
        System.out.println(hm.get(1));
        System.out.println(hm.get(2));
        
    }
}
