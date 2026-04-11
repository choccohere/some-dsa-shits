package DataStructures.ArrayArrayLists;

import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " \n");

        }
        Collections.sort(list);

        // using for each

        list.forEach(i -> {
            System.out.println( i + " ");
        });

        ListIterator<String> l = list.listIterator();

        while(l.hasNext()){
            System.out.println(l.next() + " ");
        }
        
    }

}
