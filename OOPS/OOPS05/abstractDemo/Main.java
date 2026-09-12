package OOPS05.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(18);
        son.career();

        Daughter daughter = new Daughter(20);
        // Parent daughter = new Daughter(20);
        daughter.career();

        son.normal();
        Parent.hello();
        // for abstract classes you cannot create object like this   
        // Because if you create it like then after creatiion if you call like this mom.career(); then it will give an error because career have no body inside the parent class     
        // Parent mom = new Parent(42);
    }
}
