package DataStructures.ArrayArrayLists;

import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        for( String i : list){
            System.out.print("[" + i + "]");
        }
        System.out.println();
        System.out.println(list.size());

        System.out.println(list.removeLast());
        System.out.println(list);
        for( String i : list){
            System.out.print("[" + i + "]");
        }
        System.out.println();
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        // Iterator<String> it = list.iterator();

    //     while (it.hasNext()) {
    //         System.out.print(it.next() + " \n");

    //     }
    //     Collections.sort(list);

    //     // using for each

    //     list.forEach(i -> {
    //         System.out.println( i + " ");
    //     });

    //     ListIterator<String> l = list.listIterator();

    //     while(l.hasNext()){
    //         System.out.println(l ..next() + " ");
    //     }
        
    }

}
