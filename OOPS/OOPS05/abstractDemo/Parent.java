package OOPS05.abstractDemo;

// you can't make this class final because final keyword can't let anyone to use this class but we create an abstract class to use this in child class
// final public abstract class Parent {

public abstract class Parent {

    int age;
    final int VALUE;
    public Parent(int age){
        this.age = age;
        VALUE = 144442154;
    }

    // You cannot create abstract constructor
    // abstract Parent();
    // You cannot create abstract static method in this
    static void hello(){
        System.out.println("Hey");
    }

    void normal(){
        System.out.println("This is a normal method");
    }

    abstract void career();
    abstract void partner();
}
