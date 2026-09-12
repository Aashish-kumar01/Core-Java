package OOPS02.staticExample;

public class first {
    public static void main(String[] args) {
        // Human Aashish = new Human(22, "Aashish Kumar", 1000000, false);
        // Human Rahul = new Human(23, "Rahul Godara", 200000000, true);

        // System.out.println(Aashish.name);
        // System.out.println(Rahul.name);
        // System.out.println(Aashish.population); // it will work but don't use it use the below code
        // System.out.print(Human.population);

        first funn = new first();
        funn.fun2();
    }

        // Static keyword is used to declare that to the class
        // This is not dependent on objects
        static void fun(){
            // greeting(); // you can't use this because it requires as instances
            // but the function you are using it in does not depend on instances


            // you cannot access non static stuff without referencing their instances in  a static context

            // hence, here I am referencing it
            first obj = new first();
            obj.greeting();
        }

        void fun2(){
            greeting();
        }


    // we know that something which is not static, belongs to an object
    void greeting(){
        // fun(); // we can use a static method inside a non static method
        System.out.println("Hello World");
    }
}
