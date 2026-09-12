import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5, 3);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        System.out.println(vector.capacity());
        vector.add(6);
        System.out.println(vector.capacity());


        // vector ke andar ham linked list bhi input daal sakte ya fir list ya arraylist isi tarah 
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        
        Vector<Integer> vector1 = new Vector<>(list);
        System.out.println(vector1);
    }
}
