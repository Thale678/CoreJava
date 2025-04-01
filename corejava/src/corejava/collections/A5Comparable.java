package corejava.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class A5Comparable{
    public static void main(String[] args) {


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


        Comparator<Student> comprator = Comparator.comparing(Student::getMarks).reversed();
        students.sort(comprator);
        System.out.println(students);
    }
}