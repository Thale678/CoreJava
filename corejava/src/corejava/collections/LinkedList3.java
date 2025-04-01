package corejava.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkedList3 {
    
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Manish");
        list.add("Dakshat");
        list.add("manish");
        list.add("Jitu");
        list.add("tam");
        list.add("sunny");
        list.add("Prasad");
        list.add("dakshat");
        list.addLast("Sheru");
        list.addFirst("Moti");
       list.forEach(System.out::println);
        list.removeIf(s -> s.contains("u"));
        System.out.println("After removing elements");
        list.forEach(System.out::println);

        LinkedList<String> list2 = new LinkedList<>(Arrays.asList("Moti","tam"));
        list.removeAll(list2);
        System.out.println("After removing list2 elements");
        list.forEach(System.out::println);

        list.sort(Comparator.reverseOrder());
        System.out.println("After sorting");
        list.forEach(System.out::println);


    }
}
