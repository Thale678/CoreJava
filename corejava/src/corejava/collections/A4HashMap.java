package corejava.collections;

import java.util.HashMap;

public class A4HashMap {
    
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(85 , "Manish");
        map.put(90 , "Dakshat");
        map.put(75 , "Manish");
        map.put(80 , "Jitu");
        map.put(70 , "tam");    
        map.put(95 , "sunny");
        map.put(null , "Prasad");

        System.out.println(map);
        System.out.println(map.get(80));
        System.out.println(map.keySet());
        System.out.println(map.values());
        map.forEach((k,v) -> System.out.println(k + " : " + v));
        System.out.println(map.get(null));

        System.out.println(map.containsKey(80));
        System.out.println(map.containsValue("Manish"));
        //map.entrySet(); 
        HashMap<Integer, String> newmap = new HashMap<>();
        map.forEach((k,v) -> newmap.put(k, v.toUpperCase()));
        newmap.forEach((k,v) -> System.out.println(k + " : " + v));
        
    }
}
