package OOPS03.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(box1);
        System.out.println(box2.l + " " + box2.h + " " + box2.w);
        System.out.println(box1.l + " " + box1.w + " " + box1.h);


        // BoxWeight box3 = new BoxWeight();
        // System.out.println(box3.h + " " + box3.weight);
        // BoxWeight box4 = new BoxWeight(2, 3, 4, 5);
        // System.out.println(box4.h + " " + box4.weight);

        // Box box5 = new BoxWeight(2, 3, 5, 8);
        // System.out.println(box5.w);
        // System.out.println(box5.weight); // this can't be possible



        // there are many variables in both parent and child classes 
        // you are given access to variables that are in the reference type i.e BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialized 
        // but here, when the obj itself is of type parent class, how will you call the constructor4 of the child class
        // that is why error
        // BoxWeight box6 = new Box(2, 3, 4);


        // BoxPrice box = new BoxPrice();
        // System.out.println(box.weight);

        // Box.greeting();

        // Box box = new BoxWeight();
        // box.greeting(); // you can inherit but you cannot override


    }
}
