package OOPS07.collections;

// import java.util.Collection;
import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list1.add(234);
        list1.add(84);

        list2.add(53);
        list2.add(94);

        System.out.println(list2);


        List<Integer> vector = new Vector<>();
        vector.add(23);
        vector.add(64);
        vector.add(72);
        vector.add(84);

        System.out.println(vector);
    }
}
