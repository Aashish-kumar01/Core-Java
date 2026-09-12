import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student{
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    // hamlog iska bhi istemal kar sakte name set karne ya fir setAge karke ham age bhi set bhi kar sakte hai
    // public void setName(String name){
    //     this.name = name;
    // }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

}

public class SecondC {
    public static void main(String[] args) {
        List<Student> student1 = new ArrayList<>();
        student1.add(new Student("Aashish", 20));
        student1.add(new Student("Abhishek", 24));
        student1.add(new Student("Rahul", 23));
        student1.add(new Student("Kashish", 23));
        // yaha pe hamne ek comparator ka istemal kiya lambda expression me likh kar 
        // student1.sort((a,b) -> a.getAge() - b.getAge());


        // yaha pe ham Comparator ke istemal kar rahe hai
        // Comparator<Student> comparator = Comparator.comparing(Student::getAge).reversed();

        // thenComparing ka istemal hota agar hamko ek se zyada chize compare karni hai to 
        Comparator<Student> comparator = Comparator.comparing(Student::getAge).thenComparing(Student::getName);

        student1.sort(comparator);

        // hamlog agar khud comparator banana chahe to aise bana sakte hai
        // student1.sort((a,b) -> {
        //     if(a.getAge() - b.getAge() > 0){
        //         return 1;
        //     }
        //     else if(a.getAge() - b.getAge() < 0){
        //         return -1;
        //     }
        //     else{
        //         return a.getName().compareTo(b.getName());
        //     }
        // });
        
        for(Student s: student1){
            System.out.println(s.getName()+": "+s.getAge());
        }

        // System.out.println(student1.get(2).getAge());
    }
}
