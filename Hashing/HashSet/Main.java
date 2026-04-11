package Hashing.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(4);
        set.add(3);
        set.add(2);
        set.add(5);
        set.add(4);

        System.out.println(set);

        boolean a = set.contains(1);
        boolean b = set.contains(6);

        System.out.println("A   |   B\n" + a + "   " + b);

        set.remove(1);
        set.remove(4);
        System.out.println(set);

        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " \n");

        }

    }

}