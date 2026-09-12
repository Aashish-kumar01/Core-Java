@FunctionalInterface
interface A{
    void show();
    // void config(); // this can't be happen because in (functional interface) there will be only one method define inside the interface.
}

public class FunInterface {
    public static void main(String[] args) {
        A obj = new A() {
            public void show(){
                System.out.println("In new show");
            }
        };
        obj.show();
    }
}
