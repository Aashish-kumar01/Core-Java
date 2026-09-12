import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        System.out.println(map);
        Map<String, Integer> map1 = Collections.unmodifiableMap(map); // this creates an unmodifiable map
        System.out.println(map1);
        // map1.put("C", 3); // throws exception
        Map<String, Integer> map2 = Map.of("Shubham", 2, "Aashish", 4); // this also creates an unmodifiable map
        // map2.put("Akshit", 98); // this will return an exception
        System.out.println(map2);
        Map<String, Integer> map3 = Map.ofEntries(Map.entry("Akshu", 98), Map.entry("Vivek", 23), Map.entry("Arshad", 74));
        System.out.println(map3);
    }
}
