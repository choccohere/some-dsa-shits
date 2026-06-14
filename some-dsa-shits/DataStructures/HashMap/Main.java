import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap <Integer, Integer> map = new HashMap<>();

        map.put(1, 11);
        map.put(2, 12);
        map.put(3, 13);
        map.put(4, 15);

        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            System.out.println(e);
            // System.out.println(e.getkeys());
        }

    }


    
}
