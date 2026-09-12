import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FirstCopy {
    public static void main(String[] args) {
        // CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        // "Copy on Write" means that whenever a write operation
        // like adding or removing an element 
        // instead of directly modifying the existing list
        // a new copy of the list is created, and the modification is applied to that copy
        // This ensures that other threads reading the list while it's being modified are unaffected.

        // Read Operations: Fast and direct, since they happend on a stable list without interference from modification.
        // Writer Operation: A new copy of the list is created for every modification.
        //                   The refrence to the list is then updated so that subsequent reads use this new list.

        // notepad --> notepad-copy


        List<String> shop = new CopyOnWriteArrayList<>();
        shop.add("Milk");
        shop.add("Eggs");
        shop.add("Bread");
        System.out.println("Initial list: "+shop);

        for(String item: shop){
            System.out.println(item);
            // Try to modify the list while reading
            if(item.equals("Eggs")){
                shop.add("Butter");
                System.out.println("Added Butter while reading");
            }
        }
        // purani = new
        System.out.println("Updated shop list: "+shop);

    }
}
