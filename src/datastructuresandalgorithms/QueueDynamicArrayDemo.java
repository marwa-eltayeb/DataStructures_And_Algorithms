package datastructuresandalgorithms;

import datastructuresandalgorithms.DataStructure.QueueDynamicArray;

/**
 *
 * @author Marwa
 */
public class QueueDynamicArrayDemo {
    
    public static void main(String[] args) {
		QueueDynamicArray<Integer> q= new
				QueueDynamicArray<Integer>(2);
		q.enQueue(11);
		q.enQueue(12);
		System.out.println("Size:"+ q.getSize());
		q.enQueue(12);
		System.out.println("Size:"+ q.getSize());
	}
    
}
