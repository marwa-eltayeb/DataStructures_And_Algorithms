package collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Marwa
 */
public class QueueIm {

    public static void main(String[] args) {
       
        System.out.println("Queue");
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(15);
        q.add(11);
        q.add(10);
        q.add(14);
        System.out.println(q.poll());

        System.out.println("Prority Queue");
        PriorityQueue<Integer> qp = new PriorityQueue<Integer>();
        qp.add(15);
        qp.add(11);
        qp.add(10);
        qp.add(14);
        System.out.println(qp.poll());
        System.out.println(qp.poll());

        System.out.println("Prority Queue for Object");
        PriorityQueue<Student> Students = new PriorityQueue<Student>();
        Students.add(new Student("Hussein", 27));
        Students.add(new Student("Jena", 2));
        Students.add(new Student("Laya", 1));
        System.out.println(Students.poll().name);
    }

}
