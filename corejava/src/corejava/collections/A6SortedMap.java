package corejava.collections;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class A6SortedMap {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>((a,b) -> b - a);
        map.put(85 , "Manish");
        map.put(90 , "Dakshat");
        map.put(75 , "Manish");
        map.put(80 , "Jitu");
        map.put(70 , "tam");    
        map.put(95 , "sunny");
        //map.put(null , "Prasad");

        map.forEach((k,v) -> System.out.println(k + " : " + v));
    
        System.out.println(map.firstKey());
        System.out.println(map.lastKey()); 
        System.out.println(map.headMap(80));
        System.out.println(map.tailMap(80));}
    
}
