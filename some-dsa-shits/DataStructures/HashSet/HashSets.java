import java.util.*;
public class HashSets {
    public static void main(String[] args) {
        
        HashSet<Integer> set = new HashSet<>();
        
        set.add(13);
        set.add(17);
        set.add(15);
        set.add(12);
        set.add(11);
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }
}
