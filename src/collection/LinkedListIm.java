package collection;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Marwa
 */
public class LinkedListIm {
    
    public static void main(String[] args) {
        
        LinkedList<String> ls = new LinkedList<String>();
        ls.add("Ali");
        ls.add("Ahmed");
        ls.add("Mohamed");
        ls.add("Sameer");
        
        // Read Data
        Iterator<String> itr = ls.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
    }
}
