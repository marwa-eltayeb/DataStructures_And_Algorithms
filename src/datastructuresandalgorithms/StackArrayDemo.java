package datastructuresandalgorithms;

import datastructuresandalgorithms.DataStructure.StackArray;

/**
 *
 * @author Marwa
 */
public class StackArrayDemo {

    public static void main(String[] args) {

        StackArray<Integer> stack = new StackArray<Integer>(5);
        stack.push(11); // 0
        stack.push(12); // 1
        stack.push(13); // 2
        stack.push(14); // 3
        stack.push(15); // 4
        stack.push(16);
        System.out.println("Top: " + stack.top);
        
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        stack.pop();
        
        
        

    }

}
