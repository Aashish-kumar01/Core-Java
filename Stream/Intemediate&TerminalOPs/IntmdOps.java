import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntmdOps {
    public static void main(String[] args) {
        // Intermediate operation transform a stream into another stream
        // They are lazy, meaning they don't execute until a terminal operation is invoked.

        // 1. Filter
        List<String> list = Arrays.asList("Akshit", "Ram", "Shyam", "Ghanshyam", "Akshit");
        // Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("A"));
        // no filtering at this point, to complete the filtering we need to add terminal operation

        // here is terminal operation
        long a = list.stream().filter(x -> x.startsWith("A")).count();
        System.out.println(a);


        // 2. Map
        // Stream<String> stringStream = list.stream().map(String::toUpperCase);


        // 3. sorted
        List<String> abc = list.stream().sorted().collect(Collectors.toList());
        System.out.println(abc);
        // Stream<String> sortStrm = list.stream().sorted((c, b) -> c.length() - b.length());


        // 4. distinct
        System.out.println(list.stream().filter(x -> x.startsWith("A")).distinct().count());


        // 5. Limit
        System.out.println(Stream.iterate(1, x -> x + 1).limit(45).count());

        // 6. skip
        // this will skip the first n elements but the limit will be applied after the skip elements 
        // overall skip elements are not counted in the limit
        System.out.println(Stream.iterate(1, x -> x + 1).skip(30).limit(40).collect(Collectors.toList()));

        // 7. peek
        // Perform an action on each element as it is consumed.
        Stream.iterate(1, x -> x + 1). skip(10).limit(100).peek(System.out::println).count();


        // 8. flatMap
        // Handle streams of collections, list, or arrays where each element is itself a collection
        // Flattern nested structures (e.g., lists within lists) so that they can be processed as a single sequence of elements
        // Transform and flattens elements at the same time.
        List<List<String>> listofLists = Arrays.asList(
            Arrays.asList("Apple", "Banana"), 
            Arrays.asList("Orange", "Kiwi"),
            Arrays.asList("Pear", "Grapes")
        );
        System.out.println(listofLists.get(0).get(1));

        System.out.println(listofLists
            .stream()
            .flatMap(x -> x.stream())
            .map(String::toUpperCase)
            .toList());

        // Example
        List<String> sentences = Arrays.asList(
            "Hello World", 
            "Java Streams are powerful", 
            "FlatMap is useful"
        );
        System.out.println(sentences.stream().flatMap(x -> Arrays.stream(x.split(" "))).map(String::toUpperCase).toList());
    }
}


