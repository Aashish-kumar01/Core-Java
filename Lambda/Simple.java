@FunctionalInterface
interface A3 {
    // void show();
    void show(int i);
}

public class Simple {
    public static void main(String[] args) {
        // A obj = new A()
        // {
        //     public void show(){
        //         System.out.println("In new show");
        //     }
        // };


        // Lambda expression with argument
        // A obj = (i) -> 
        // {
        //     System.out.println("In show "+i);
        // };


        // A obj = i -> 
        // {
        //     System.out.println("In show "+i);
        // };


        // lambda expression ek extra annonymus class nahi banata alag se lekin Simple class ka size increase ho jata hai 
        A3 obj = i -> System.out.println("In show "+i);
        obj.show(2);
    }
}