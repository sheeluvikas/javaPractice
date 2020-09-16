package com.practice.cloning;

public class DeepCloningDemo {

    public static void main(String[] args) throws CloneNotSupportedException {

        /** we need to override the clone() method in every reference type we have in our object hierarchy */
        Employee employee = new Employee("Vikas", new City("Kanpur", 208022L));

        Employee employee1 = employee.clones();


        System.out.println("Comparing Employee objects : "+ ( employee == employee1)); /** This will return false*/

        System.out.println("Comparing City objects : " + (employee.getCity() == employee1.getCity()));
        /** The above code will return false, as this is Deep clone and NOT Shallow cloning */
        /** The city is also cloned in the clone method of Employee class */

        System.out.println("Comparing the Name : " + (employee.getName() == employee1.getName()));
        /***
         * String method doesn't have clone because String is immutable hence we don't need Clone() method
         */

    }
}
