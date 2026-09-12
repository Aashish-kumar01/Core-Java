import java.util.LinkedHashMap;

public class LRUCache<K, V> extends LinkedHashMap<K, V>{ // Least recently used entry
    private int capacity;
    public LRUCache(int capacity){
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args){
        LRUCache<String, Integer> studentMap = new LRUCache<>(3);
        studentMap.put("Bob", 23);
        studentMap.put("Alice", 64);
        studentMap.put("Ram", 86);
        studentMap.get("Bob");
        studentMap.put("Vipul", 98);
        studentMap.get("Bob");
        System.out.println(studentMap);
    }
}
