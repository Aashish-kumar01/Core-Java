package OOPS04.access;

public class A {
    // if you are not writing any access modifier then you are not able to access outside the package
    private int num; // this is accessed inside the class
    // public is access from anywhere
    // private is accessed from class, package, subclass of same package, and subclass of different package
    String name;
    int[] arr;

    // getter
    public int getNum(){
        return num;
    }

    // setter
    public void setNum(int num){
        this.num = num;
    }

    public A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
