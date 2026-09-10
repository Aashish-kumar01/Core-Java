
class A{
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In A show");
    }
}
class B extends A{
    // @Override
    public void showTheDataWhichBelongToThisClass(){
        System.out.println("In B show");
    }
}

public class First {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongToThisClass();
    }
}
