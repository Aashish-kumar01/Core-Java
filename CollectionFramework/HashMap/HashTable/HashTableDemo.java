import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        // Hashtable<Integer, String> table = new Hashtable<>();
        // Hashtable is synchornised
        // no null key or vale
        // Legacy class, ConcurrentHashMap
        // slower than HashMap
        // Only Linked list in case of collision
        // All methods are synchronised
        // table.put(1, "Apple");
        // table.put(2,"banana");
        // table.put(3,"Cherry");
        // System.out.println(table);
        // System.out.println("Value for key 2: "+table.get(2));
        // System.out.println(table.containsKey(1));
        // table.remove(1);
        // System.out.println(table.containsKey(1));
        // table.put(null, "value"); // throws exception
        // table.put(4,null); // throws exception


        Hashtable<Integer, String> map = new Hashtable<>();
        Thread thread1 = new Thread(() -> {
            for(int i = 0; i<1000; i++){
                map.put(i,"Thread1");
            }
        });
        Thread thread2 = new Thread(() -> {
            for(int i = 1000; i<2000; i++){
                map.put(i,"Thread2");
            }
        });
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(map.size());
    }
}
