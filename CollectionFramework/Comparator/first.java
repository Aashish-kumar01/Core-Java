import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String>{
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}


// class MyComparator implements Comparator<Integer>{
//     @Override
//     public int compare(Integer o1, Integer o2) {
//         return o2-o1;
//     }
// }

class MyComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2); // descending
    }
}



public class first {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);

        // list.sort(new StringLengthComparator());
        list.sort((a, b) -> b-a); // using lambda expression
        System.out.println(list);
       List<String> words = Arrays.asList("banana", "apple", "date");
       words.sort(new MyComparator());
    //    words.sort((a,b) -> a.length() - b.length()); // using lambda expression

       System.out.println(words);
    }
}


