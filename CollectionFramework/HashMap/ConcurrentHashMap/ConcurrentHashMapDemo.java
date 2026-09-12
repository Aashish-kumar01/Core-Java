// import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        // ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        // java 7 --> segment based locking --> 16 segments --> smaller hashmap
        // only the segment being written to or read from is locked
        // read: do no require locking unless there is a write operation happening on the smae segment
        // write: lock

        // java 8 --> no segmentation
        //        --> Compare-And-Swap approach --> no locking except resizing or collision
        // Thread A last saw --> x = 42
        // Thread A word --> x to 50
        // if x is still 42, then change it to 50 else don't change and retry
        // put --> index 
    }
}
