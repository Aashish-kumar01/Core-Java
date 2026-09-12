import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        // Thread-Safe
        // Copy-On-Write Mechanism
        // No Duplicate Elements
        // Iterators Do not Reflect  modifications

        CopyOnWriteArraySet<Integer> copyOnWriteSet = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        for(int i = 1; i< 6; i++){
            copyOnWriteSet.add(i);
            concurrentSkipListSet.add(i);
        }

        System.out.println("Initial CopyOnWriteArraySet: " +copyOnWriteSet);
        System.out.println("Initial ConcurrentSkipListSet: "+concurrentSkipListSet);

        System.out.println("\nIterating and modifying CopyOnWriteArraySet: ");
        // isme iterate karte waqt 6 print nahi hoga ha pura iteration complete ho jaayega to usme hamne 6 add kiya hai to uske baad agar print kare to ho jaayega
        for(int num : copyOnWriteSet){
            System.out.println("Reading from CopyOnWriteArraySet: "+num);
            // Attempting to modify the set during iteration
            copyOnWriteSet.add(6);
        }
        System.out.println(copyOnWriteSet);


        System.out.println("\nIterating and modifying ConcurrentSkipListSet");
        // Isko hamlog weekly consistent bolte hai kyunki ho sakta hai jo modification kiya gaya hai usko ye print kara dega ya fir kabhi kabhi nai bhi karata hai
        for(int num : concurrentSkipListSet){
            System.out.println("Reading from ConcurrentSkipListSet: "+num);
            // Attempting to modify the set during iteration
            concurrentSkipListSet.add(6);
        }
    }
}
