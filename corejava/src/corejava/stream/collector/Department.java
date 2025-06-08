package corejava.stream.collector;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


class Department {

private int deptId;
private String deptName;
private int empId;

    public Department(int deptId, String deptName, int empId) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.empId = empId;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Department{");
        sb.append("deptId=").append(deptId);
        sb.append(", deptName=").append(deptName);
        sb.append(", empId=").append(empId);
        sb.append('}');
        return sb.toString();
    }

    

}
