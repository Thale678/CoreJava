package corejava.stringprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class anagram {
    





    public static void main(String[] args) {
        String s1  = "listen";
String s2  = "silent";

List<String> charlList = new ArrayList();
List charlList2 = new ArrayList();

s1.toCharArray();

for (char  c : s1.toCharArray()) {
    
    charlList.add(String.valueOf(c));


}
s2.toCharArray();

for (char  c : s2.toCharArray()) {
    
    charlList2.add(c);


}

 String collect = charlList.stream().collect(Collectors.joining());

 String collect3 = (String) charlList2.stream().map(String::valueOf).collect(Collectors.joining());

/* 
charlList.sort(Comparator.naturalOrder());
charlList.forEach(System.out::println);
System.out.println("*****************");
charlList2.sort(Comparator.naturalOrder());
charlList2.forEach(System.out::println);
*/

String collect1 = s1.chars().mapToObj(c -> String.valueOf((char) c)).sorted().collect(Collectors.joining());
String collect2 = s2.chars().mapToObj(c -> String.valueOf((char) c)).sorted().collect(Collectors.joining());

System.out.println(collect1+" : "+collect2);


System.out.println(collect1.equals(collect2));
    }


}
