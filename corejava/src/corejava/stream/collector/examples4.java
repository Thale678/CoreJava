package corejava.stream.collector;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class examples4 {
    




public static void main(String[] args) {

  List<Employees>  employee = getEmployee();

System.err.println("Group By Dept");
Map<String, List<Employees>> collect = employee.stream().sorted(Comparator.comparing(Employees::getEmpName))
.collect(Collectors.groupingBy(x -> x.getDepartment().getDeptName()));
collect.entrySet().stream().forEach(entry ->  System.out.println(entry.getKey()+ " : "+entry.getValue()));

System.out.println("Sort By Descending salary");
employee.stream().sorted((Comparator.comparing(Employees::getSalary).reversed())).collect(Collectors.toMap(Employees::getEmpName,
                        Employees::getSalary,(oldValue, newValue) -> oldValue,LinkedHashMap::new)).entrySet().forEach(entry ->  System.out.println(entry.getKey()+ " : "+entry.getValue()));

System.out.println("MaxSalary eployee in each account :");

employee.stream().collect(Collectors.groupingBy(x -> x.getDepartment().getDeptName()
,Collectors.maxBy(Comparator.comparing(Employees::getSalary)))).forEach((k,v) ->  System.out.println(k+ " : "+v));

System.out.println("-------------------------------------------\n only MaxSalary employee in each account : \n");
employee.stream().collect(Collectors.groupingBy(x -> x.getDepartment().getDeptName()
,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employees::getSalary)), 
maxEmp -> maxEmp.map(e -> e.getSalary()).orElse(0)

))).forEach((k,v) ->  System.out.println(k+ " : "+v));

System.out.println("-------------------------------------------\nDisplay name and salry onlt dept vise : \n");
employee.stream().collect(Collectors.groupingBy(x -> x.getDepartment().getDeptName(),Collectors.toMap(Employees::getEmpName,
                        Employees::getSalary)
)).forEach((k,v) ->  System.out.println(k+ " : "+v));



/* 
employee.stream().collect(Collectors.groupingBy(x -> x.getDepartment().getDeptName(),
        Collectors.collectingAndThen(
                Collectors.maxBy(Comparator.comparing(Employees::getSalary)),
                emp -> emp.map(e -> Map.entry(e.getEmpName(), e.getSalary())).orElse(null)
        ))).forEach((k,v) ->  System.out.println(k+ " : "+v));
      */  
} 
















public static List<Employees> getEmployee(){

return    Arrays.asList(
            new Employees(1, "Manish", 80000, new Department(101, "Development", 1)),
            new Employees(2, "Rajesh", 75000, new Department(102, "QA", 2)),
            new Employees(3, "Suresh", 60000, new Department(101, "Development", 1)),
            new Employees(4, "Amit", 50000, new Department(103, "Support", 3)),
            new Employees(5, "Vijay", 85000, new Department(102, "QA", 2)),
            new Employees(6, "Prakash", 90000, new Department(104, "HR", 4)),
            new Employees(7, "Aishwarya", 70000, new Department(101, "Development", 1)),
            new Employees(8, "Megha", 72000, new Department(103, "Support", 3)),
            new Employees(9, "Nisha", 95000, new Department(104, "HR", 4)),
            new Employees(10, "Ankit", 82000, new Department(102, "QA", 2)),
            new Employees(11, "Rahul", 55000, new Department(101, "Development", 1)),
            new Employees(12, "Sunil", 64000, new Department(103, "Support", 3)),
            new Employees(13, "Naveen", 87000, new Department(102, "QA", 2)),
            new Employees(14, "Dinesh", 66000, new Department(101, "Development", 1)),
            new Employees(15, "Priya", 74000, new Department(103, "Support", 3)),
            new Employees(16, "Kiran", 92000, new Department(104, "HR", 4)),
            new Employees(17, "Pooja", 88000, new Department(102, "QA", 2)),
            new Employees(18, "Vikas", 78000, new Department(101, "Development", 1)),
            new Employees(19, "Sneha", 81000, new Department(103, "Support", 3)),
            new Employees(20, "Harish", 62000, new Department(104, "HR", 4))
        );

}



}
