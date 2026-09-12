package OptionalEx;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalX {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aashish", "Navin", "Lakshmi", "John", "Kishor");

        // Optional<String> name = names.stream().filter(str -> str.contains("x")).findFirst(); // Either we can use this or we can use orElse method to avoid using Optiona class
        String name = names.stream().filter(str -> str.contains("x")).findFirst().orElse("Not found");
        
        System.out.println(name);
    }
}
