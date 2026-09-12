class A2{
    int age;

    public void show(){
        System.out.println("In show");
    }

    class B{
        public void config(){
            System.out.println("In cofig");
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        A2 obj = new A2();
        obj.show();

        //To create the obj of the inner class
        A2.B obj1 = obj.new B();
        // if we have static class B then it is directly written
        // A.B obj1 = new A.B();
        obj1.config();
    }
}
