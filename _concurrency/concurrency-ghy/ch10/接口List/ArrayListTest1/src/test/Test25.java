package test;

import java.util.ArrayList;
import java.util.Iterator;

public class Test25 {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");

        list.set(0, "newA");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
