package corejava.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

class FunctionDemo{
    public static void main(String[] args) {
       
       // System.out.println(f.apply(4));

        Function<Integer, Integer> f1 = s -> s * 2;
        Function<Integer, Integer> f2 =  s-> s*s;
        
        //andThen
        System.out.println("And Then :"+f1.andThen(f2).apply(4));
        //compose
        System.out.println("Compose :"+f1.compose(f2).apply(4));
        
        //IdentityFunction
        Function<String, String> f3 = Function.identity();
        System.out.println("Identity :"+f3.apply("Manish"));
        System.out.println("Identity :"+Function.identity().apply(4));

        
        List<Student> students = List.of(new Student("John", 90), 
        new Student("Doe", 80), 
        new Student("Smith", 70));
        
        @SuppressWarnings("unused")
        Function<List<Student>,List<Student>> doublemarks = studentss -> {
            List<Student> updatedList = new ArrayList<>();
            for(Student s : studentss){
                 s.setMarks(f1.apply(s.getMarks()));
                    updatedList.add(s);
                }
            return updatedList;
            };
           // return updatedList;

           //doublemarks.
            doublemarks.apply(students).forEach(student -> {
                System.out.println(student.getName() + " 2x: " + student.getMarks()); 
            });
        //UnaryOperator is a child class of Function
        //if input and output are of same type then we can use UnaryOperator
        //We have to mention the type of input and output as a single generic type
        UnaryOperator<Integer> u = i -> i * 2;
        System.out.println("Unary Operator :"+u.apply(4));
        UnaryOperator<String> u1 = i -> i.toLowerCase();
        System.out.println("Unary Operator :"+u1.apply("MANISH"));

//Binaryoperator is a child class of BIFunction
        //if inputs and output are of same type then we can use BinaryOperator
        //We have to mention the type of input and output as a single generic type
        //BinaryOperator is used when we have to perform operation on two inputs and return the same type of output

        BinaryOperator<Integer> B = (i,j) -> i * j;
        System.out.println("Binary Operator :"+B.apply(4,5));
        BinaryOperator<String> B1 = (i,j) -> i.concat(j);
        System.out.println("Binary Operator :"+B1.apply("Manish ","Thale"));

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
