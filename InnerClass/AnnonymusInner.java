class A1{
    public void show(){
        System.out.println("In A show");
    }
}

public class AnnonymusInner {
    public static void main(String[] args) {
        A1 obj = new A1()
        {
            public void show(){
                System.out.println("In new show");
            }
        };
        obj.show();
    }
}
