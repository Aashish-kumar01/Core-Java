package OOPS06.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Aashish = new Human(23, "Aashish Kumar");
        // Human twin = new Human(Aashish);

        Human twin = (Human)Aashish.clone();

        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));
        
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(Aashish.arr));
        System.out.println(Arrays.toString(twin.arr));

    }
}
                           