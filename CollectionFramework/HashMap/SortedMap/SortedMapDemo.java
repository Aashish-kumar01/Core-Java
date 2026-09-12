// import java.util.ArrayList;
// import java.util.Comparator;
// import java.util.List;
// import java.util.Map;
import java.util.NavigableMap;
// import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

// class MComparator implements Comparator<Map.Entry<String, Integer>>{

//     @Override
//     public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//         return o1.getKey().compareTo(o2.getKey());
//     }
// }
public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<String, Integer> sortedMap = new TreeMap<>((a,b) -> b.length() - a.length());
        sortedMap.put("Aashish", 99);
        sortedMap.put("Chetna", 93);
        sortedMap.put("shish", 84);
        sortedMap.put("", 14);
        System.out.println(sortedMap);
        // sortedMap.get();
        // System.out.println(sortedMap.firstKey());
        // System.out.println(sortedMap.lastKey());
        // System.out.println(sortedMap.headMap("Bashish"));
        // System.out.println(sortedMap.tailMap("Bashish"));
        // sortedMap.subMap("Aashish", "Bashish");
        // List<Map.Entry<String, Integer>> list = new ArrayList<>(sortedMap.entrySet());

        // list.sort(new MComparator());
        // System.out.println(list);


        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        navigableMap.put(1,"One");
        navigableMap.put(5,"Two");
        navigableMap.put(3,"Three");
        navigableMap.put(4,"Four");
        System.out.println(navigableMap);
        System.out.println( navigableMap.lowerKey(4));
        System.out.println(navigableMap.ceilingKey(2));
        System.out.println(navigableMap.higherEntry(1));
    }    
}
