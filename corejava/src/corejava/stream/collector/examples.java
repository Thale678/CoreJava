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
List<Employee> employees = Arrays.asList(
    new Employee("Alice", "HR", 50000),
    new Employee("Bob", "IT", 60000),
    new Employee("Charlie", "HR", 70000),
    new Employee("David", "IT", 80000),
    new Employee("Eve", "Finance", 90000)
);
    
Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(x -> x.getDepartment()));
System.out.println("Group by dept :"+collect);



 Map<String, Integer> collect3 = employees.stream()
.collect(Collectors.groupingBy(x -> x.getDepartment(),
 Collectors.summingInt(x -> x.getSalary())));
System.out.println("Salary sum :"+collect3);


 Map<String, Double> SalaryAverage = employees.stream()
.collect(Collectors.groupingBy(x -> x.getDepartment(),
 Collectors.averagingInt(x -> x.getSalary())));
System.out.println("SalaryAverage in each dept :"+SalaryAverage);

Map<String, Optional<Employee>> collect2 = employees.stream()
.collect(Collectors.groupingBy(x -> x.getDepartment(),
 Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))));
 System.out.println("Max salary by dept :"+collect2);


String collect4 = employees.stream().collect(Collectors.mapping(x -> x.getName(),
 Collectors.joining(" , ")));

 System.out.println("Emp Names :"+collect4);

// the key is the department name and the value is a list of 
//employee names in that department, sorted by their names.
Map<String, Long> count = employees.stream().collect(Collectors.groupingBy
(x -> x.getDepartment(),Collectors.counting()));
System.out.println("Group by dept and count  :"+count);

Map<String, Optional<Employee>> collect5 = employees.stream().collect(Collectors.groupingBy
(x -> x.getDepartment(),Collectors.minBy
(Comparator.comparingInt(Employee::getSalary))));

System.out.println("Group by dept and lowest salary  :"+collect5);
collect5.forEach((k,v) -> System.out.println("Dept :"+k+"  : "+v.get().getSalary()));


//write a Java program to create a comma-separated string of all employee names
//, sorted by their salary in descending order.
String collect6 = employees.stream().sorted(Comparator.comparingInt(Employee::getSalary)
.reversed())
.map(Employee::getName)
.collect(Collectors.joining(" , "));
System.out.println("Emp Names sorted by salary :"+collect6);
}
}
class Employee {
    private String name;
    private String department;
    private int salary;
    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public Employee(int i, String string, int j, Department d1) {
        //TODO Auto-generated constructor stub
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + "]";
    }
}