package com.codewithakash.corejava.lesson5.collections;

public class Employee {

    private int empId;
    private String empName;
    private String empAdd;


    public Employee(int empId, String empName, String empAdd) {
        this.empId = empId;
        this.empName = empName;
        this.empAdd = empAdd;
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


    public String getEmpAdd() {
        return empAdd;
    }


    public void setEmpAdd(String empAdd) {
        this.empAdd = empAdd;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((empAdd == null) ? 0 : empAdd.hashCode());
        result = prime * result + empId;
        result = prime * result + ((empName == null) ? 0 : empName.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (empAdd == null) {
            if (other.empAdd != null)
                return false;
        } else if (!empAdd.equals(other.empAdd))
            return false;
        if (empId != other.empId)
            return false;
        if (empName == null) {
            return other.empName == null;
        } else return empName.equals(other.empName);
    }


    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", empAdd=" + empAdd + "]";
    }


}
