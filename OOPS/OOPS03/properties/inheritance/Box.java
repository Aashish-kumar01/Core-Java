package OOPS03.properties.inheritance;


// for stop the class to be inherited we can use final keyword
public class Box {
    double l;
    double h;
    double w;
    // private double n; if we initialize anything private then it will not be used by its child class


    static void greeting(){
        System.out.println("Hey, I am in class. Greetings!");
    }

    
    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // cube 
    Box(double side){

        super(); // this is refering to the object class
        this.w= side;
        this.l = side;
        this.h = side;
    }

    public Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information(){
        System.out.println("Running the Box");
    }
}
