package corejava.stream.collector;

public class Employee {

    private int empId;
    private String empName;
    private int salary;
    private Department department;

    public Employee( int empId, String empName, int salary,Department department) {
        
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.department = department;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{");
        sb.append("empId=").append(empId);
        sb.append(", empName=").append(empName);
        sb.append(", salary=").append(salary);
        sb.append(", department=").append(department);
        sb.append('}');
        return sb.toString();
    }

  

    
}
