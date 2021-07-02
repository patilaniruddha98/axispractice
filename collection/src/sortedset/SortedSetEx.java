package sortedset;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEx {

	public static void main(String[] args)
    {
        SortedSet<String> ts= new TreeSet<String>();
  
        ts.add("Chitrak");
        ts.add("Yash");
        ts.add("Aniruddha");

        ts.add("Aniruddha");// Adding duplicate element

        System.out.println(ts);

        ts.remove("Aniruddha");
        System.out.println("Set after removing " + "Aniruddha:" + ts);
  
    
        System.out.println("Iterating over set:");
        Iterator<String> i = ts.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }

}
