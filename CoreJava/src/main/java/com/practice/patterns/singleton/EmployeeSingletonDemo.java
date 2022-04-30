package com.practice.patterns.singleton;

public class EmployeeSingletonDemo {

    public static void main(String[] args) {
        EmployeeSingleton employeeSingleton = EmployeeSingleton.getEmployeeSingleton();
        employeeSingleton.setEmpId("1");
        System.out.println(employeeSingleton.getEmpId());
        EmployeeSingleton employeeSingleton1 = EmployeeSingleton.getEmployeeSingleton();
        if(employeeSingleton == employeeSingleton1){
            System.out.println("Objects are same");
        }
        else {
            System.out.println("Objects are not same");
        }
    }
}
