package corejava.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArrayList1{
public static void main(String[] args) {

//Fixed size array ,caanot add or remove element,only you can modify
List<String> list1 = Arrays.asList("Manish", "Dakshat", "manish", 
"Jitu", "tam", "sunny", "Prasad", "dakshat");
List<String> list2 =List.of("Manish", "Dakshat", "manish", 
"Jitu", "tam", "sunny", "Prasad", "dakshat");

    ArrayList<Integer> list = new ArrayList();
    //Creating arraylist
list.add(54);
list.add(102);
list.add(07);
list.add(33);
list.add(85);
list.add(200);
list.add(25);

System.out.println("Print List :");
list.forEach(x -> System.out.println(x));

System.out.println("list.get():"+list.get(1));
System.out.println("list.contains:"+list.contains(200));

//add element at specific index
list.add(1, 80);
list.forEach(System.out::println);

//add element at specific index
list.set(4, 99);
//Add element at last
list.add(99);
list.forEach(x -> System.out.println(x));

//Sorted List
list.sort(null);

System.out.println("Sorted  List:");
list.forEach(x -> System.out.println(x));
//Convert to array
Object[] array = list.toArray();


}
}