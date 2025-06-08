package corejava.stream.collector;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class examples2 {

    private static Map<String, String> collect4;

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        List<Employee> Employees = Arrays.asList(
    new Employee("Tom", "Marketing", 55000),
    new Employee("Jerry", "Sales", 65000),
    new Employee("Spike", "Marketing", 75000),
    new Employee("Tyke", "Sales", 85000),
    new Employee("Butch", "Finance", 95000)
);

  Map<String, Integer> collect = Employees.stream()
.collect(Collectors.groupingBy(x -> x.getDepartment(),Collectors.summingInt(x -> x.getSalary())));
System.out.println("total salary  by dept :"+collect);
collect.forEach((k,v)->System.out.println("Dept :"+k+" Salary :"+v));


  // Question 2: List of employee names in each department, sorted by their salary in ascending order
        @SuppressWarnings("unused")
  Map<String, List<Employee>> collect3 = Employees.stream()
  .collect(Collectors.groupingBy(Employee::getDepartment,
      Collectors.collectingAndThen(Collectors.toList(), list -> {
          list.sort(Comparator.comparingInt(Employee::getSalary));
          return list;
      })));

      collect4 = Employees.stream().sorted(Comparator.comparingInt(Employee::getSalary))
      .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(e->e.getName() + " - " + e.getSalary() + ",",Collectors.joining())));
System.out.println("Group by dept (sorted by salary): " + collect4);


// Question 3: List of employee names in each department, sorted by 
//their salary in descending order

Map<String, Optional<Employee>> collect2 = Employees.stream().collect
(Collectors.groupingBy(Employee::getDepartment,
Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))));

System.out.println("Max salary by dept :"+collect2);

// Question 3: Department name and max salary in each department
Map<String, Integer> maxSalaryByDepartment = Employees.stream().collect
(Collectors.groupingBy(Employee::getDepartment,
    Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt
    (Employee::getSalary)),
        emp -> emp.get().getSalary())));
System.out.println("Max salary by dept :"+maxSalaryByDepartment);

}
}