import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        // Feature introduced in java 8
        // process collections of data in a functional and declarative manner
        // Simplify Data Processing
        // Improve Readability and Maintainability 
        // Enable Easy parralelism

        // What is Stream ?
        // a sequence of elements supporting functional and declarative programming

        // How to use Streams ?
        // Source, intermediate operations & terminal operation

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
        // int count = 0;
        // for(int i : num){
        //     if(i % 2 == 0){
        //         count++;
        //     }
        // }
        // System.out.println(count);

        // To find count of even number
        System.out.println(num.stream().filter(x -> x % 2 == 0).count()); // here .stream() is Source, .filter() is intermediate operation, .count() is terminal operation


        // Creating Streams
        // 1. From Collection
        // List<Integer> li = Arrays.asList(1, 2, 3, 9);
        // Stream<Integer> stream = li.stream();
        // 2. From Arrays
        // String[] array = {"A", "B", "C"};
        // Stream<String> stream1 = Arrays.stream(array);
        // 3. Using Stream.of()
        // Stream<String> stream2 = Stream.of("a", "b");
        // 4. Infinite Streams
        // Stream<Integer> generate = Stream.generate(() -> 1).limit(100); // limit laga sakte warna infinite ho jaayega
        List<Integer> collect = Stream.iterate(1, x -> x +1).limit(100).collect(Collectors.toList());
        System.out.println(collect);
    }
}
