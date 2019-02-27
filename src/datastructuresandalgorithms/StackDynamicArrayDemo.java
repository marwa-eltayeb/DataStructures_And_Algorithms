package datastructuresandalgorithms;

import datastructuresandalgorithms.DataStructure.StackDynamicArray;

/**
 *
 * @author Marwa
 */
public class StackDynamicArrayDemo {

    public static void main(String[] args) {

        StackDynamicArray<Integer> st = new StackDynamicArray<Integer>(2);
        st.push(1);
        st.push(2);
        System.out.println("Top: " + st.top);
        System.out.println("Size stack:" + st.getSize());
        st.push(3);
        System.out.println("Top: " + st.top);
        System.out.println("Size stack:" + st.getSize());

    }

}
