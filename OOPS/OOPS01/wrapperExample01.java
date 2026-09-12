public class wrapperExample01 {
    public static void main(String[] args) {
        int a = 10; // here is a primitive datatype
        
        // Integer num = new Integer(43);
        Integer num = 45; // it is created as an object

        int b = 20;
        Integer ar = 10;
        Integer br = 20;

        Swap(ar, br);
        System.out.println(ar+" "+br);
        // swap(a, b);
        // System.out.println(a+" "+b);
  

        // Final key word ke istemal se ham kisi bhi primitive datatype ko constant bana sakte hai
        // final int bonus = 3;
        // bonus = 2; // ye error dega ki can't assign value to the final variable
        // System.out.println(bonus);

        // agar ham kisi object ko banate hai final keyword ki madad se to ham usme changes kar sakte lekin us object ko kisi dusre object ko point nahi karwa sakte jaise ki:

        // final A Aashish = new A("Aashish Kumar");
        // Aashish.name = "Other name";

        // when a non primitive is final, you cannot reassign it.
        // Aashish = new A("new object");

        A obj;
        for(int i = 0; i<=1000000; i++){
            obj = new A("random object");
        }

    }


    // yaha pe ye function ke hisab se 'ar' aur 'br' ek object hai lekin jab ham usme changes karte hai to uski value change nahi ho rahi hai kyunki ye ek final function hai.
    static void Swap(Integer ar, Integer br){
        Integer temp = ar;
        ar = br;
        br = temp;
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}

class A {
    // final int a; // ham agar kisi primitive datatype ko final kar rahe to hame use initialize karna padega declaration ke samay
    final int num = 10;
    String name;

    public A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
