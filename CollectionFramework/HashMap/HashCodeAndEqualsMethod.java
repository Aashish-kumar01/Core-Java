import java.util.HashMap;
import java.util.Objects;

class Student{
    private String name;
    private int id;

    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

    // @Override
    // public boolean equals(Object obj) {
    //     return super.equals(obj);
    // }
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        return id == other.getId() && Objects.equals(name, other.getName());
    }

    // @Override
    // public int hashCode() {
    //     return super.hashCode();
    // }
    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return  "Id: "+id +", Name: "+name;
    }
}

public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>();
        Student s1 = new Student("Aashish", 1);
        Student s4 = new Student("Aashish", 1);
        Student s2 = new Student("Rahul", 2);
        Student s3 = new Student("Abhishek", 3);

        map.put(s1, "Engineer"); // hashcode1 --> index
        map.put(s2, "Designer"); // hashcode2 --> index
        map.put(s3, "Manager"); // hashcode3
        // --> index
        map.put(s4, "Athlete"); // hashcode4 --> index

        System.out.println("HashMap Size: "+map.size());
        System.out.println("Value for s1: "+ map.get(s1));
        System.out.println("Value for s4: "+ map.get(s4));

        System.out.println(s1);
    }
}
