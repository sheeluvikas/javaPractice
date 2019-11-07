package com.practice.cloning;

import java.util.Objects;

public class Employee implements Cloneable {

    private String name;
    private City city;

    public Employee(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    /***
     * we need to override the clone() method in every reference type we have in our object hierarchy.
     * @return
     * @throws CloneNotSupportedException
     */
    public Employee clone() throws CloneNotSupportedException {
        Employee employee = (Employee) super.clone();
        employee.city = this.city.clone();

        return employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(city, employee.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city);
    }
}
