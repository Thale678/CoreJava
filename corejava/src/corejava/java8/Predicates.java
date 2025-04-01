package corejava.java8;

import java.util.List;
import java.util.function.Predicate;

public class Predicates {

    public static void main(String[] args) {
        
        System.out.println("hello");


        Predicate<Integer> predicate = n -> n%2 ==0;

        System.out.println(predicate.test(10));
        System.out.println(predicate.test(15));

        Predicate<String> s = n -> n.contains("a");
        System.out.println(s.test("apple"));

        //Negate
        //System.out.println(s.negate().test("apple"));

        List<Student> students = List.of(new Student("John", 90), 
        new Student("Doe", 80), 
        new Student("Smith", 70));

        System.out.println("Students with marks greater than 75");
       students.forEach(student -> {
           // System.out.println(student.getName() + " : " + student.getMarks()); 
           
        });

        Predicate<Student> p = student -> student.getMarks() > 75;

        System.out.println("Students with marks greater than 75 : " + p.test(new Student("John", 90)));
        System.out.println("Students with marks greater than 75 : " + p.test(new Student("Doe", 60)));

        Predicate<Student> p1 = student -> student.getName().toLowerCase().contains("a");
        Predicate<Student> p2 = student -> student.getName().toLowerCase().contains("s");
       //AND
        Predicate<Student> p3 = p1.and(p2);
        //OR
       // Predicate<Student> p3 = p1.or(p2);

        System.out.println("Students with name containing 'a and s' : " + p3.test(new Student("Mani", 90)));

        
        
    }


    
}

class Student{
    String name;
    int marks;
    public Student(String name, int marks) {
        super();
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
