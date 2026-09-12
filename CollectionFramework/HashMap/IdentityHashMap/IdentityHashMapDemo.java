// import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        String key1 = new String("key");
        String key2 = new String("key");
        // both will return different value
        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));
        // both will return same value
        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());
        Map<String, Integer> map = new IdentityHashMap<>();
        // IdentityHashMap me hashcode object ke address ke hisab se calculate hota jiski wajah dono key alag hai jabki dono ki value "key" hi hai
        // isme use hota hai IdentityHashcode and ==
        map.put(key1, 1);
        map.put(key2, 2);
        System.out.println(map);
    }
}
