package com.practice.patterns.singleton;

public class EmployeeSingleton {

    private String name;
    private String empId;

    private static EmployeeSingleton employeeSingleton ;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    private EmployeeSingleton(){

    }

    public static EmployeeSingleton getEmployeeSingleton(){
        if(employeeSingleton == null){
            employeeSingleton = new EmployeeSingleton();
        }
        return employeeSingleton;
    }
}
