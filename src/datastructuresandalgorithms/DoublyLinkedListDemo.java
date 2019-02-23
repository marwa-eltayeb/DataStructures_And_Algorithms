package datastructuresandalgorithms;

import datastructuresandalgorithms.DataStructure.DoublyLinkedList;

/**
 *
 * @author Marwa
 */
public class DoublyLinkedListDemo {

     public static void main(String[] args) {
        
        // Double Dat
        DoublyLinkedList<Double> db = new DoublyLinkedList<Double>();
        db.add(1.1d);
        db.add(2.2d);
        db.add(3.3d);
        System.out.println("Before Deletion");
        db.display(); 
        System.out.println("After Deletion");
        db.delete();
        db.display();
        
     }
    
}
