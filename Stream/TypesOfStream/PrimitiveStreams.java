// import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimitiveStreams {
    public static void main(String[] args) {
        // int[] numbers = {1, 2, 3, 4, 5};
        // IntStream stream = Arrays.stream(numbers);

        System.out.println(IntStream.range(1,5).boxed().collect(Collectors.toList())); // 5 is exclusive
        System.out.println(IntStream.rangeClosed(1,5).boxed().collect(Collectors.toList())); // Both are inclusive

        IntStream.of(1, 2, 3);

        DoubleStream doubles = new Random().doubles(5);
        // System.out.println(doubles.sum());
        System.out.println(doubles.boxed().toList());

        IntStream ints = new Random().ints(5);
        System.out.println(ints.boxed().toList());
    }
}
