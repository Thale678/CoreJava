package corejava.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Comparator2 {


    public static void main(String[] args) {
       
        
        List<String> list = Arrays.asList("Manish", "Dakshat", "manish", 
        "Jitu", "tam", "sunny", "Prasad", "dakshat");
        

        list.sort((a,b) -> a.length() - b.length());

        System.err.println(list);

        List<Student> students = Arrays.asList(
            new Student("Manish", 85),
            new Student("Dakshat", 90),
            new Student("manish", 75),
            new Student("Jitu", 80),
            new Student("tam", 70),
            new Student("sunny", 95),
            new Student("Prasad", 90),
            new Student("dakshat", 92)
        );

        //user defined sort
        Comparator<Student> studentComparator = (a,b) -> b.getMarks() - a.getMarks();
       students.sort(studentComparator);
        System.out.println(students);

        Comparator<Student> comparator =  
        Comparator.comparing(Student::getMarks).thenComparing(Student::getName).reversed();
        students.sort(comparator);
        System.out.println("After sorting");
        students.forEach(System.out::println);


    }
    
}
