// import java.util.Arrays;
public class OOPS01 {
    public static void main(String [] args){
        // System.out.println("Aashish KUmar");
        // Store 5 roll nos
        // int[] numbers = new int[5];

        // Stores 5 names 
        // String[] names = new String[5];

        // Data of 5 Students: {roll no, name, marks}
        // int[] rno = new int[5];
        // String[] name = new String[5];
        // float[] marks = new float[5];

        // Student[] students = new Student[5];

        // just declaring 
        // Student Aashish = new Student();
        // Student Aashish;
        // Aashish = new Student();
        // Now, I am giving the data to the object
        // Aashish.rno = 1;
        // Aashish.name = "Aashish Kumar";
        // Aashish.marks = 99;
        // System.out.println(Aashish);

        // is tarike se ham arguments ko pass kar sakte hai constructor bana ke
        Student Aashish = new Student(11, "Aashish", 95);
        // below all will print the default value if the value is not assigned.
        System.out.println(Aashish.rno);
        System.out.println(Aashish.name);
        System.out.println(Aashish.marks);
        
        // Aashish.changename("Akash");// this will change the this.name to "Akash"
        Aashish.greeting();
        Student random = new Student(Aashish);// if we remove the empty constructor then it is mandatory to give the arguments 
        System.out.println(random.name);

        // this is used to call the constructor using constructor this keyword
        Student random2 = new Student();
        System.out.println(random2.name);

        // pass by refrence
        // here , maine one object me changes kiya aur maine two ek object banaya jisko maine wahi refrence diya jisko one refer kar raha tha to is waja one me kiye gaye changes two me bhi honge kyunki dono ek hi point kar raha hai
        Student one = new Student();
        Student two = one;
        one.name = "Something Something";
        System.out.println(two.name);

        // System.out.println(Arrays.toString(students));
    }
}

// create a class
// for every single student
class Student{
    int rno;
    String name;
    float marks = 90;

    // ye is function me this.name likhne se kuch fark nahi padega kyunki jo mera object hai wo constructor ko call kar raha hai to constructor ke andar ham pehle hi this keyword ka use kar chuke hai to isko yaha likhna jaruri nahi hai lekin likh bhi sakte hai
    void greeting(){
        System.out.println("Hello! My name is " + this.name);
    }

    void changename(String name){
        this.name = name;
    }

    Student (Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    // we need a way to add the values of the above properties object by object 

    // we need one word to access every object
    // when you call the constructor with zero value it will call this constructor
    // this is known as constructor overloading
    Student () {
        this.rno = 13;
        this.name = "Aashish Kumar";
        this.marks = 99.0f;
        // this is how you call  constructor from another constructor
        // Internally: new Student(13, "Default person", 110.0f);
        // this (13, "Default Person", 110.0f);
    }

    // when you call the constructor with three value it will call this constructor         

    // Student arpit = new Student(17, "Arpit", 85.0f);
    // Here, this will be replaced with arpit
    Student (int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
