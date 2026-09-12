// import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        // Collectors is a utility class
        // provides a set of methods to create common collectors

        // 1. Collecting to a list
        List<String> names = Arrays.asList("Alice", "Bob", "CharLie", "Ashraf");
        List<String> a = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        System.out.println(a);


        // 2. Collecting to a set
        List<Integer> num = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 5, 5);
        Set<Integer> set = num.stream().collect(Collectors.toSet());
        System.out.println(set);


        // 3. Collecting to a Specified Collection
        // ArrayDeque<String> collect = names.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));

        
        // 4. Joining Strings
        String concatenatedName = names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(concatenatedName);


        // 5. Summarizing Data
        // Generates statistical summary (count, sum, min, average, max)

        List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11);
        IntSummaryStatistics stats = numbers.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("Count: "+stats.getCount());
        System.out.println("Sum: "+stats.getSum());
        System.out.println("Min: "+stats.getMin());
        System.out.println("Average: "+stats.getAverage());
        System.out.println("Max: "+stats.getMax());


        // 6. Calculating Averages
        Double average = numbers.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println("Average: "+average);

        // 7. Counting Elements
        long count = numbers.stream().collect(Collectors.counting());
        System.out.println("Count: "+count);

        // 8. Grouping Elements
        List<String> words = Arrays.asList("Hello", "World", "Java", "Stream", "Collector");
        // By giving classifier
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length)));
        // By giving classifier and collector
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(", "))));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())));
        // By giving classifier, supplier, and collector
        TreeMap<Integer, Long> treeMap = words.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(treeMap);


        // 9. Partitioning Elements
        // Paritions elements into two groups (true and false) based on a predicate
        System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length() > 5)));


        // 10. Mapping and Collecting
        // Applies a mapping function before collecting
        System.out.println(words.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList())));



        // Example 1: Collecting Names by Length
        List<String> l1 = Arrays.asList("Anna", "Bob", "Alexander", "Brian", "Alice");
        System.out.println(l1.stream().collect(Collectors.groupingBy(String::length)));
        
        // Example 2: Counting Word Occurrences
        String sentence = "Hello World Hello Java World";
        List<String> l2 = Arrays.asList(sentence.split(" "));
        System.out.println(l2.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting())));

        // Example 3: Partitioning Even and Odd Numbers
        List<Integer> l3 = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(l3.stream().collect(Collectors.partitioningBy(x -> x%2 == 0)));

        // Example 4: Summing Values in a Map
        Map<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 30);
        items.put("Guava", 40);
        System.out.println(items.values().stream().reduce(Integer::sum).get());
        System.out.println(items.values().stream().collect(Collectors.summingInt(x -> x)));

        // Example 5: Creating a Map from Stream Elements 
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println(fruits.stream().collect(Collectors.toMap(x -> x, x -> x.length())));

        // Example 6: Creating a Map which values are count of that word
        List<String> word2 = Arrays.asList("Apple", "Banana", "Apple", "Orange", "Orange", "Guava", "Guava", "Guava");
        // System.out.println(word2.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting())));
        System.out.println(word2.stream().collect(Collectors.toMap(k -> k, v -> 1, (x, y) -> x+y)));
    }
}
