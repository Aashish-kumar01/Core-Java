package Input;
class A extends Thread{
    public void run(){
        for(int i = 1; i<10; i++){
            System.out.println("hi");
            try{
                Thread.sleep(10);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i = 1; i<10; i++){
            System.out.println("hello");
            try{
                Thread.sleep(10);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}
public class Threads {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
        
    }
}