package OOPS05.abstractDemo;

public class Son extends Parent{  // concete class

    public Son(int age){
        super(age);
        // this.age = age;
    }

    @Override
    void career(){
        System.out.println("I am going to be a Engineer");
    }

    @Override
    void partner(){
        System.out.println("I love Captain Marvel");
    }
}
