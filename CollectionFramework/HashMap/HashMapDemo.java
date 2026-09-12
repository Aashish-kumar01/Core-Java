import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String>  map = new HashMap<>();
        map.put(1,"Aashish");
        map.put(2,"Kashish");
        map.put(3,"Neha");

        System.out.println(map);
        System.out.println(map.get(2)); // O(1)
        System.out.println(map.containsKey(4)); // check whether present or not in map O(1)
        System.out.println(map.containsValue("Neha")); // check whether present or not in map


        for(int i : map.keySet()){
            System.out.println(map.get(i));
        }



        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer, String> entry: entries){
            entry.setValue(entry.getValue().toUpperCase());
            // System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        // map.remove(1);
        boolean res = map.remove(21, "Aashish");
        System.out.println("Removed ? : "+res);
        System.out.println(map);

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.contains(23);
    }
}
