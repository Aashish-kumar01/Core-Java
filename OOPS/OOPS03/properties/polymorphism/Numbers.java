package OOPS03.properties.polymorphism;

// 1st type of polymorphism
// compile-time polymorphism
public class Numbers {
    double sum(double a, int b){
        return a + b;
    }

    // this is method is used if we pass int value when calling the constructor
    double sum(int a, int b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(2, 3);
        obj.sum(1, 3, 7);
        // obj.sum(4,5,6, 8);
    }
}
