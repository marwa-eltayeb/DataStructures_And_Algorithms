package collection;

import java.util.Stack;

/**
 *
 * @author Marwa
 */
public class StackIm {

    public static void main(String[] args) {
        
        Stack<String> st = new Stack<String>();
        st.push("Developer");
        st.push("Manager");
        st.push("Tester");
        System.out.println(st.pop());
        
    }

}
