import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String, Integer> map = new ConcurrentSkipListMap<>();
        // ye concurrentMap ki tara hi hai bas isme chize sorted manner me hoti hai
        // isko app concurrentMap TreeMap bhi bol sakte hai
        map.put("Aashish", 99);
        System.out.println(map);
    }
}
