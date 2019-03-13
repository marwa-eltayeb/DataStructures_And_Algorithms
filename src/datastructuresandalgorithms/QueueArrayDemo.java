package datastructuresandalgorithms;

import datastructuresandalgorithms.DataStructure.QueueArray;

/**
 *
 * @author Marwa
 */
public class QueueArrayDemo {

    public static void main(String[] args) {

        QueueArray<Integer> q = new QueueArray<Integer>(5);
        q.queue(5); // First item
        q.queue(2);
        q.queue(3);
        q.queue(6);
        q.queue(8); // Last item
        q.queue(4); // Queue is full
        System.out.println("Dequeu:" + q.deQueue());
        System.out.println("Dequeu:" + q.deQueue());
        System.out.println("Dequeu:" + q.deQueue());
        System.out.println("Dequeu:" + q.deQueue());
        System.out.println("Dequeu:" + q.deQueue());
        System.out.println("Front:" + q.front); // 5
        System.out.println("Rear:" + q.rear); // 4
        
        
        
    }
}
