package OOPS06.comparing;

import java.util.Arrays;
// import java.util.Collections;
// import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        Student Aashish = new Student(1, 99.0f);
        Student Rahul = new Student(2, 98.0f);
        Student Abhay = new Student(3, 98.5f);
        Student Anya = new Student(4, 96.0f);
        Student Kashish = new Student(5, 95.0f);

        Student[] list = {Aashish, Rahul, Abhay, Anya, Kashish};

        System.out.println(Arrays.toString(list));
        
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        // you can also give a constructor as parameter
        // Arrays.sort(list, new Comparator<Student>(){
        //     @Override
        //     public int compare(Student o1, Student o2){
        //         return (int)(o1.marks - o2.marks);
        //     }
        // });


        // using lambda expression
        Arrays.sort(list, (o1, o2) -> (int)(o1.marks - o2.marks));
        System.out.println(Arrays.toString(list));

        // if(Aashish.compareTo(Rahul) > 0){
        //     System.out.println(Aashish.compareTo(Rahul));
        //     System.out.println("Aashish has more marks");
        // }
    }
}
