package datastructuresandalgorithms;

import datastructuresandalgorithms.DataStructure.LinkedListDS;
import datastructuresandalgorithms.DataStructure.Node;

/**
 *
 * @author Marwa
 */
public class LinkedListDemo {
    
    public static void main(String[] args) {
        
        // Integer
        LinkedListDS<Integer> ls = new LinkedListDS<Integer>();
        ls.add(11);
        ls.add(12);
        ls.add(13);
        System.out.println("Before Deletion");
        ls.display(); 
        System.out.println("After Deletion");
        ls.delete();
        ls.display();
        
        System.out.println("********************************");
        
        // String
        LinkedListDS<String> ls2 = new LinkedListDS<String>();
        ls2.add("Soha");
        ls2.add("Rana");
        ls2.add("Salma");
        System.out.println("Before Deletion");
        ls2.display(); 
        System.out.println("After Deletion");
        ls2.delete();
        ls2.display();
       
    }
    
}
