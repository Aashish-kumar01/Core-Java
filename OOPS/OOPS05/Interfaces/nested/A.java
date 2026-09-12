package OOPS05.Interfaces.nested;

public class A {
    // nested interfaces
    public interface NestedInterface {
        boolean isOdd(int num);
    }
}


class B implements A.NestedInterface{

    @Override
    public boolean isOdd(int num){
        return (num & 1) == 1;
    }
}
