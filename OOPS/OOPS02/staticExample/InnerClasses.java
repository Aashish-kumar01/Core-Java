package OOPS02.staticExample;

// outside class cannot be static
public  class InnerClasses {
    static class Test {
        String name;

        public Test(String name){
            this.name = name;
        }

        public String toString(){
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Aashish");
        Test b = new Test("Rahul");

        System.out.println(a);

        System.out.println(a.name);
        System.out.println(b.name);
    }
}



