import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOps {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);

        // 1. collect
        list.stream().skip(1).collect(Collectors.toList());
        System.out.println(list.stream().skip(1).toList());

        
        // 2. forEach
        list.stream().forEach(x -> System.out.println(x));


        // 3. reduce : Combines elemenst to produce a single result
        Optional<Integer> optInt = list.stream().reduce(Integer::sum);
        System.out.println(optInt.get());


        // 4. count


        // 5. anyMatch, allMatch, noneMatch
        // it return boolean
        System.out.println(list.stream().anyMatch(x -> x / 4 == 1));
        boolean n = list.stream().allMatch(x -> x > 0);
        System.out.println(n);
        boolean c = list.stream().noneMatch(x -> x < 0);
        System.out.println(c);


        // 6. findFirst, findAny
        // it return Optinal<T>
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());


        // 7. toArray()
        // Object[] array = Stream.of(1, 2, 3).toArray();


        // 8. min / max
        System.out.println(Stream.of(2,44, 982).max((o1, o2) -> o1 - o2).get());
        System.out.println(Stream.of(2,44, 982).min(Comparator.naturalOrder()).get());


        // 9. forEachOrdered
        List<Integer> numb = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Using forEach with paralled stream");
        numb.parallelStream().forEach(System.out::println);
        System.out.println("Using forEachOrdered with paralled stream");
        numb.parallelStream().forEachOrdered(System.out::println);

        
        // Examples: Filtering and Collecting Names
        List<String> name = Arrays.asList("Anna", "Bob", "Charlie", "David");
        System.out.println(name.stream().filter(x -> x.length() > 3).toList());

        // Examples: Squaring and Sorting numbers
        List<Integer> nm = Arrays.asList(3, 12, 4, 23);
        System.out.println(nm.stream().map(x -> x * x).sorted().toList());

        // Examples: Summing Values
        List<Integer> num1 = Arrays.asList(2, 5, 6, 7, 9, 15);
        System.out.println(num1.stream().reduce(Integer::sum).get());

        // Example: Counting Occurences of a Character
        String sentence = "Hello World";
        System.out.println(sentence.chars().filter(x -> x == 'l').count());

        // Example 
        // Streams cannot be reused after terminal operation has been called
        Stream<String> stream = name.stream();
        stream.forEach(System.out::println);
        // List<String> list1 = stream.map(String::toUpperCase).toList(); // throws Exception

        // stateful & stateless
        // stateful :- In this operation we need to consider all the elements while operating
        // stateless :- In this operation we no need to consider all the elements while operating
    }
}
