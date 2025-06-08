package corejava.stringprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class reversewords {
    public static void main(String[] args) {
        

String s = "My Name is Manish , I live in Mumbai";

List<String> asList = Arrays.asList(s.split("\\s+"));
Collections.reverse(asList);
String collect = asList.stream().collect(Collectors.joining(" "));
    
System.out.println(collect);
}
}
