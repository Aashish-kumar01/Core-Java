package OOPS06.generics;

import java.util.ArrayList;
import java.util.function.Consumer;


public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<5; i++){
            arr.add(i + 1);
        }

        // arr.forEach((item) -> System.out.println(item * 2));

        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(fun);

        Operations sum = (a, b) -> a + b;
        Operations mul = (a, b) -> a * b;
        Operations sub = (a, b) -> a - b;

        LambdaFunctions myCalculator = new LambdaFunctions();
        System.out.println(myCalculator.operate(4, 2, sum));
        System.out.println(myCalculator.operate(2, 6, mul));
        System.out.println(myCalculator.operate(6,2, sub));
    }

    private int operate(int a, int b, Operations op){
        return op.operation(a, b);
    }
}

interface Operations{
    int operation(int a, int b);

}
