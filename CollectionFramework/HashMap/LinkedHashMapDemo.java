import java.util.HashMap;
import java.util.LinkedHashMap;
// import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.7f, true); // Double linked list
        linkedHashMap.put("Orange", 10);
        linkedHashMap.put("Apple", 20);
        linkedHashMap.put("Guava", 13);

        linkedHashMap.get("Apple");
        linkedHashMap.get("Orange"); // this keep the key value as recent used and the key value is not used frequently that will print first

        for(Entry<String, Integer> entry: linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + ": "+entry.getValue());
        }

        HashMap<String, Integer> hashMap = new HashMap<>();
        // LinkedHashMap linkedHashMap1 = new LinkedHashMap(hashMap);

        hashMap.put("Aashish", 99);
        hashMap.put("Bob", 82);
        hashMap.put("Akshit", 23);

        Integer res = hashMap.getOrDefault("Vipul", 32); // return the value corresponding to vipul  if present in hashmap otherwise return the defaultvalue given by us.
        System.out.println(res);
        hashMap.putIfAbsent("Bob", 98);
        System.out.println(hashMap);
    }
}
