package corejava.stringprograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstNonReapitingChar {

    public static void main(String[] args) {
        String  s = "racecar";

   LinkedHashMap<String, Long> collect = s.chars().mapToObj(c -> String.valueOf((char)c)).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new,Collectors.counting()));

       // collect.forEach((k,v) -> System.err.println(k+" : "+v));


        Optional<String> first = collect.entrySet().stream().filter(e -> e.getValue()==1)
        .map(Map.Entry::getKey)
        .findFirst();

        System.out.println("First uniq char : "+first.orElse("None"));
    }
    
}
