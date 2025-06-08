package corejava.stream.collector;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class examples {
        
    public static void main(String[] args) {
        // TODO Auto-generated method stub
List<Employee> Employee = Arrays.asList(
    new Employee("Alice", "HR", 50000),
    new Employee("Bob", "IT", 60000),
    new Employee("Charlie", "HR", 70000),
    new Employee("David", "IT", 80000),
    new Employee("Eve", "Finance", 90000)
);
    
Map<String, List<Employee>> collect = Employee.stream().collect(Collectors.groupingBy(x -> x.getDepartment()));
System.out.println("Group by dept :"+collect);



 Map<String, Integer> collect3 = Employee.stream()
.collect(Collectors.groupingBy(x -> x.getDepartment(),
 Collectors.summingInt(x -> x.getSalary())));
System.out.println("Salary sum :"+collect3);


 Map<String, Double> SalaryAverage = Employee.stream()
.collect(Collectors.groupingBy(x -> x.getDepartment(),
 Collectors.averagingInt(x -> x.getSalary())));
System.out.println("SalaryAverage in each dept :"+SalaryAverage);

Map<String, Optional<Employee>> collect2 = Employee.stream()
.collect(Collectors.groupingBy(x -> x.getDepartment(),
 Collectors.maxBy(Comparator.comparingInt(x -> x.getSalary()))));
 System.out.println("Max salary by dept :"+collect2);


String collect4 = Employee.stream().collect(Collectors.mapping(x -> x.getName(),
 Collectors.joining(" , ")));

 System.out.println("Emp Names :"+collect4);

// the key is the department name and the value is a list of 
//employee names in that department, sorted by their names.
Map<String, Long> count = Employee.stream().collect(Collectors.groupingBy
(x -> x.getDepartment(),Collectors.counting()));
System.out.println("Group by dept and count  :"+count);

Map<String, Optional<Employee>> collect5 = Employee.stream().collect(Collectors.groupingBy
(x -> x.getDepartment(),Collectors.minBy
(Comparator.comparingInt(x -> x.getSalary()))));

System.out.println("Group by dept and lowest salary  :"+collect5);
collect5.forEach((k,v) -> System.out.println("Dept :"+k+"  : "+v.get().getSalary()));


//write a Java program to create a comma-separated string of all employee names
//, sorted by their salary in descending order.
//Employee.stream().sorted(Comparator.comparingInt(x -> x).reversed());

//employees.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println);
}
}
//