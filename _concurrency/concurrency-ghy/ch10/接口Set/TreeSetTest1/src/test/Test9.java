package test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test9 {

    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add(10);
        set.add(9);
        set.add(1);
        set.add(2);

        // headSet:С<=10
        Set newSet = set.headSet(10, true);
        Iterator iterator = newSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
