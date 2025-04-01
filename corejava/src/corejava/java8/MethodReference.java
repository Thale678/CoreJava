package corejava.java8;

import java.util.Set;
import java.util.TreeSet;




public class MethodReference {

    //public static void print(String s){
     //   System.out.println(s);
   // }

    public static void main(String[] args) {
        
        System.out.println("hello");


       Set<String> set = Set.of("Manish", "Kumar", "Singh");
       set.forEach(System.out::println);
       Set<String> set1 = new TreeSet<String>(set);
       System.out.println("After Sorting :");
       set1.forEach(System.out::println);
       // set.forEach(s -> print(s));
       set.stream().map(x -> x.length()).forEach(System.out::println);
       
    }    
}
