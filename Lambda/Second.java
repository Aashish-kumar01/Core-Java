interface B3{
    int add(int i, int j);
}

public class Second {
    public static void main(String[] args) {
        B3 obj = (i, j) -> i+j;

        System.out.println(obj.add(2,5));
    }
}
