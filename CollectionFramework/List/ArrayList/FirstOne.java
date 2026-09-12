import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Collections;
import java.util.List;

public class FirstOne {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.getClass().getName());

        List<String> list1 = Arrays.asList("Monday", "Tuesday");
        System.out.println(list1.getClass().getName());
        list1.set(1, "Sunday");


        // List<Integer> list2 = List.of(1,2,3,4); // this is unmodifiedable list
        // list2.set(1,7);


        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);

        List<Integer> list4 = List.of(5,6,7,8,9,10);

        list3.addAll(list4);
        System.out.println(list3);


        List<Integer> list5 = new ArrayList<>();
        list5.add(6);
        list5.add(2);
        list5.add(3);
        list5.add(4);

        list5.remove(Integer.valueOf(3));
        System.out.println(list5);

        Integer[] arr = list5.toArray(new Integer[0]);
        for(int x: arr){
            System.out.println(x);
        }

        // Collections.sort(list5);
        list5.sort(null);
    }
}
