package datastructuresandalgorithms;

import datastructuresandalgorithms.DataStructure.QueueLinkedList;

/**
 *
 * @author Marwa
 */
public class QueueLinkedListDemo {

    public static void main(String[] args) {

        QueueLinkedList<String> q = new QueueLinkedList<String>();
        q.enQueue("Hanan");
        q.enQueue("Samira");
        q.enQueue("Hala");

        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        q.enQueue("Ali");
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        

    }

}
