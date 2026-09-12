import java.lang.ref.WeakReference;

class Phone{
    String name;
    String model;

    public Phone(String name, String model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone [name=" + name + ", model=" + model + "]";
    }    
}

public class GarbageCollection {
    public static void main(String[] args) {
        // Phone phone = new Phone("Apple", "16 pro max");
        // System.out.println(phone);
        // phone = null;
        // System.out.println(phone);

        WeakReference<Phone> phoneWeakReference = new WeakReference<>(new Phone("Apple", "16 pro max"));
        System.out.println(phoneWeakReference.get());
        System.gc();
        try{
            Thread.sleep(10000);
        }catch (Exception ignored){
        }
        System.out.println(phoneWeakReference.get());
    }
}
