package OOPS04.access;

public class objectDemo {

    int num;
    float gpa;
    public objectDemo(int num, float gpa){
        this.num = num;
        this.gpa = gpa;
    }
             
    // already covered
    @Override
    public String toString(){
        return super.toString();
    }

    // @Override
    // protected void finalize() throws Throwable{
    //     super.finalize();
    // }

    // we will go in details of how to create it in hashmanp lecture
    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }


    // this will check the value inside the object
    // @Override
    // public boolean equals(Object obj){
    //     return this.num == ((objectDemo)obj).num;
    // }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args){
        objectDemo obj = new objectDemo(34, 56.8f);
        objectDemo obj2 = new objectDemo(34, 78.9f);
        // System.out.println(obj2.hashCode());
        // System.out.println(obj.hashCode());

        if(obj == obj2) {
            System.out.println("Obj is equal to obj2");
        }

        if(obj.equals(obj2)){
            System.out.println("Obj is equal to obj2");
        }
        
        // here getClass is final so we can't override it.
        // this getClass has methods to get the information about the class like 
        // obj.getClass().getName();
        System.out.println(obj.getClass());


        // to check whether the object is the instance of the class or not
        System.out.println(obj instanceof objectDemo);
    }
}
