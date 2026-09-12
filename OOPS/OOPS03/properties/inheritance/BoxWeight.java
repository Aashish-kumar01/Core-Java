package OOPS03.properties.inheritance;

public class BoxWeight extends Box {
    double weight;
    // double avg; // if we initialize anything in the child class then i will not be able to access them by the parent class object

    public BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight){
        super(l, h, w); // what is this? This saying calll the parent class constructor
        // used to initialize values persent in parent class
        this.weight = weight;
    }
}


