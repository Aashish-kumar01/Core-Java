// import java.util.Arrays;
import java.util.List;
// import java.util.function.BiConsumer;
// import java.util.function.BiFunction;
// import java.util.function.BiPredicate;
import java.util.Arrays;
// import java.util.function.BinaryOperator;
// import java.util.function.Consumer;
// import java.util.function.Function;
// import java.util.function.Predicate;
// import java.util.function.Supplier;
// import java.util.function.UnaryOperator;
// import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8Demo {
    public static void main(String[] args) {
        //Streams


        // Java 8 --> minimal code, functional programming
        // Java 8 --> lambda expression, Stream, Date & Time API

        // Lambda expression
        // Lambda expression is an anonymous function (no name, no return type, no access modifier)

        Thread t1 = new Thread(()-> {
            System.out.println("Hello");
        });
        t1.start();

        MathOperation sumOperation = (a,b) -> a+b;
        int res = sumOperation.operate(1, 2);
        System.out.println(res);

        // Predicate --> Functional interface  (Boolean valued function)
        // use predicate if you want to check something
        // Predicate<Integer> isEven = x -> x %2 == 0;
        // System.out.println(isEven.test(3));
        // Predicate<String> isWordStartWithA = x -> x.startsWith("A");
        // System.out.println(isWordStartWithA.test("shish"));

        // Predicate<String> isWordStart = x -> x.toLowerCase().startsWith("a");
        // Predicate<String> iswordEnd = x -> x.toLowerCase().endsWith("h");
        // Predicate<String> both = isWordStart.and(iswordEnd);
        // System.out.println(both.test("Ashraf"));



        // Function --> work for you
        // Function<Integer, Integer> doubleIt = x -> 2*x;
        // Function<Integer, Integer> tripleIt = x -> 3*x;
        // System.out.println(doubleIt.andThen(tripleIt).apply(20));
        // System.out.println(tripleIt.andThen(doubleIt).apply(20));
        // System.out.println(doubleIt.compose(tripleIt).apply(20));
        // System.out.println(doubleIt.apply(100));

        // Identity
        // Function<Integer, Integer> identity = Function.identity();
        // Integer res2 = identity.apply(9);
        // System.out.println(res2);

        // Consumer
        // Consumer<Integer> consumer = x -> System.out.println(x);
        // consumer.accept(42);
        // List<Integer> list = Arrays.asList(1, 2, 3);
        // Consumer<List<Integer>> printlist = x -> {
        //     for(int i : x){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // };
        // printlist.accept(list);

        // Supplier
        // Supplier<String> givehelloWorld = () -> "Hello World";
        // System.out.println(givehelloWorld.get());

        // Combined example
        // Predicate<Integer> predicate = x -> x %2 == 0;
        // Function<Integer, Integer> function = x -> x * x;
        // Consumer<Integer> consumer = x -> System.out.println(x);
        // Supplier<Integer> supplier = () -> 36;
        // if(predicate.test(supplier.get())){
        //     consumer.accept(function.apply(supplier.get()));
        // }

        // BiPredicate, BiConsumer, BiFunction
        // BiPredicate<Integer, Integer> isSumEven = (x,y) -> (x+y) % 2 == 0;
        // System.out.println(isSumEven.test(3,5));
        // BiConsumer<Integer, String> biConsumer = (x,y) -> {
        //     System.out.println(x+" "+y);
        // };
        // biConsumer.accept(441, "Aashish");
        // BiFunction<String, String, Integer> biFunction = (x,y) -> (x + y).length();
        // System.out.println(biFunction.apply("a", "bc"));

        // UnaryOperator, BinaryOperator
        // UnaryOperator<Integer> mul = x -> 2 * x;
        // BinaryOperator<Integer> sum = (x,y) -> x + y;
        // System.out.println(sum.apply(53,9));
        // System.out.println(mul.apply(42));

        // Method reference --> use method without invoking & in place of lambda expression
        List<String> student = Arrays.asList("Ram", "Shyam", "Ghanshyam");
        student.forEach(x -> System.out.println(x));
        student.forEach(System.out::println);

        // Constructor reference
        List<String> names = Arrays.asList("A", "B", "C");
        List<MobilePhone> mobilePhoneList = names.stream().map(MobilePhone::new).collect(Collectors.toList());
        // List<MobliePhone> mobilePhoneList = names.stream().map(name -> new MobliePhone(name)).collect(Collectors.toList());
        mobilePhoneList.forEach(x -> System.out.println(x.name));
    }
}

class MobilePhone{
    String name;

    public MobilePhone(String name){
        this.name = name;
    }
}

// @FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

