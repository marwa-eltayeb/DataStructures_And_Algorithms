package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 *
 * @author Marwa
 */
public class HashSetIm {

    public static void main(String[] args) {

        HashSet<String> al = new HashSet<String>();
        al.add("Amira");
        al.add("Rania");
        al.add("Soheer");
        al.add("Tara");
       

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Linked HashSet");
        
        // Linked
        LinkedHashSet<String> al2 = new LinkedHashSet<String>();
        al2.add("Ali");
        al2.add("Ramez");
        al2.add("Samer");
        al2.add("Mahmoud");

        Iterator<String> itr2 = al2.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }

}


