package OOPS02.singleton;

public class Singleton {
    // private int num = 0;
    private Singleton(){

    }

    private static Singleton instance;

    public static Singleton getInstances(){
        // check whether 1 obj is created or not 
        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}
