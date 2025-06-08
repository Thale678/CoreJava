package corejava.stream.collector;

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