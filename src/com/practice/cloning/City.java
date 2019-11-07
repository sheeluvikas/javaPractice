package com.practice.cloning;

import java.util.Objects;

public class City implements Cloneable{

    private String name;
    private Long pin;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPin() {
        return pin;
    }

    public void setPin(Long pin) {
        this.pin = pin;
    }

    public City(String name, Long pin) {
        this.name = name;
        this.pin = pin;
    }

    public City clone() throws CloneNotSupportedException {
        return (City) super.clone();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(name, city.name) &&
                Objects.equals(pin, city.pin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pin);
    }
}
