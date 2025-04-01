package corejava.collections;

import java.util.HashMap;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class A7NavigableMap {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>((a,b) -> b - a);
        map.put(85 , "Manish");
        map.put(90 , "Dakshat");
        map.put(75 , "Manish");
        map.put(80 , "Jitu");
        map.put(70 , "tam");    
        map.put(95 , null);
        //map.put(null , "Prasad");

        map.forEach((k,v) -> System.out.println(k + " : " + v));
    
        System.out.println(map.lowerKey(79));
        System.out.println(map.higherKey(81));
        System.out.println(map.ceilingKey(88));
}
}
