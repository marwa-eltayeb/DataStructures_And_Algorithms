package datastructuresandalgorithms;

import datastructuresandalgorithms.DataStructure.StackLinkedList;

/**
 *
 * @author Marwa
 */
public class StackLinkedListDemo {

    public static void main(String[] args) {

        StackLinkedList<String> st = new StackLinkedList<String>();

        st.push("Marwa");
        st.push("Soha");
        st.push("Nora");

        System.out.println(st.pop());
        System.out.println(st.pop());
        
        //st.display();

    }

}
