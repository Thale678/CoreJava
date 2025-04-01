package corejava.stream.collector;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class example3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

  Department D1= new Department(101, "HR", "EMP001");
Employee E1 = new Employee(101,"Alice",500,D1);

//Employee E2 = new Employee(102,"Bob",600,D1);

List<Employee> employees = Arrays.asList(
new Employee(101,"Alice",500,new Department(101, "HR", "EMP001")),
new Employee(102,"Bob",600,new Department(102, "IT", "EMP002")),    
new Employee(103,"Charlie",700,new Department(103, "HR", "EMP003")),
new Employee(104,"David",800,new Department(104, "IT", "EMP004")),
new Employee(105,"Eve",900,new Department(105, "Finance", "EMP005")),
new Employee(106,"Frank",1000,new Department(106, "Finance", "EMP006")),
new Employee(107,"George",1200,new Department(107, "Finance", "EMP007")),
new Employee(108,"Harry",1300,new Department(108, "Finance", "EMP008")),
new Employee(109,"Ivan",1300,new Department(109, "Finance", "EMP009")),
new Employee(110,"Iban",1400,new Department(110, "Finance", "EMP010"))


);

//Find emploee with name "Alice"
employees.stream().filter(x -> x.getEmpName().equals("Bob")).forEach(System.out::println);


System.out.println("Sorted By Emp Name :");
employees.stream().sorted(Comparator.comparing(Employee::getEmpName).reversed()).forEach(System.out::println);
//question 1: List of employee names in each department, sorted by their salary in ascending order
//question 2: List of employee names in each department, sorted by their salary in descending order


System.out.println("Sorted By Emp Name and Emp ID :");
employees.stream().sorted(Comparator.comparing(Employee::getEmpName).thenComparing(Employee::getEmpId)).forEach(System.out::println);


System.out.println("Find Employee with 3rd Highest Salary :");
employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(2).findFirst().ifPresent(System.out::println);
 
System.out.println("Find Employee with  Min Salary :");
employees.stream().min(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
 
System.out.println("Gorup by Dept :");
employees.stream().collect(Collectors.groupingBy(emp -> emp.getDepartment().getDeptName() , Collectors.counting())).forEach((k,v)->System.out.println(k+" : "+v));


System.out.println("Gorup by Dept and max Salary :");
employees.stream().collect(Collectors.groupingBy(x -> x.getDepartment().getDeptName(), Collectors.maxBy(Comparator.comparing(Employee::getSalary)))).forEach((k,v)->System.out.println(k+" : "+v));

System.out.println("Gorup by Dept and Salary sum:");
employees.stream().collect(Collectors.groupingBy(x -> x.getDepartment().getDeptName(), Collectors.summingLong(Employee::getSalary))).forEach((k,v)->System.out.println(k+" : "+v));  

System.out.println("Gorup by Dept and returns only name:");
employees.stream().collect(Collectors.groupingBy(x -> x.getDepartment().getDeptName(), Collectors.mapping(Employee::getEmpName, Collectors.joining(",")))).forEach((k,v)->System.out.println(k+" : "+v));

Map<String, Integer> collect3 = employees.stream().collect(Collectors.toMap(x -> x.getEmpName(), x -> x.getSalary()));



int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
int[] arr2 = {3,4,5,9,1};
List<Integer> list = Arrays.stream(arr1).boxed().toList();

List<Integer> list2 = Arrays.stream(arr2).boxed().filter(x -> list.contains(x)).toList();


//Find count of characters in a string
String str = "HelloWorldJavaCore";

char[] charArray = str.toCharArray();

String[] split = str.split("");


//Arrays.stream(split).map(x -> x.toUpperCase()).collect(Collectors.groupingBy(x -> x, Collectors.counting())).forEach((k,v)->System.out.println(k+" : "+v));

str.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(ch -> ch, Collectors.counting())).forEach((k,v)->System.out.println(k+" : "+v));

//find first reapeted character in a string
System.out.print("find first reapeted character in a string ");
Map<Character, Long> collect = str.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

 collect.entrySet().stream().filter(x -> x.getValue() > 1).findFirst().ifPresent(System.out::print);

 System.out.println("find first reapeted integers : ");
 Map<Integer, Long> collect2 = Arrays.asList(1,2,5,2,8,9,1,5,0,3,4,5).stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));

  collect2.entrySet().stream().filter(x -> x.getValue() > 1).collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue())).forEach((k,v) -> System.out.println(k+" : "+v));
    




  String str1 = "HelloWorldJavaCore";
}
}
