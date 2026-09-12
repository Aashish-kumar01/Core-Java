import java.util.Collections;
// import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
// import java.util.concurrent.ConcurrentSkipListSet;

public class SetOverview {
    public static void main(String[] args) {
        // Set is a collection that cannot contain duplicate elements
        // faster operations
        // Map --> HashMap, LinkedHashMap, TreeMap, EnumMap
        // Set --> HashSet, LinkedHashSet, TreeSet, EnumSet

        // Ham set ki jagah NavigableSet bhi likh sakte kyunki TreeSet NavigableSet ko implement karta hai 
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(32);
        set.add(64);
        set.add(9);
        System.out.println(set);
        System.out.println(set.contains(2));
        System.out.println(set.remove(1));
        set.clear();
        System.out.println(set.isEmpty());
        for(int i : set){
            System.out.println(i);
        }

        
        // for Thread Safety
        // Set<Integer> set1 = new ConcurrentSkipListSet<>();


        // Unmodifiable Set
        Set<Integer> numb = Set.of(1, 2, 3, 4, 5, 42, 523, 256, 34, 62, 66, 621);
        Collections.unmodifiableSet(numb);
    }
}
