package com.structure;

public class Vehicle {

    private boolean isCar = true;
    private boolean isDriver;
    private boolean isAircraft;

    public Vehicle(MP mp){

        if(mp instanceof PM){
            this.setDriver(true);
            this.setAircraft(true);
            isAircraft = true;
        }
    }

    public boolean isCar() {
        return isCar;
    }

    public void setCar(boolean car) {
        isCar = car;
    }

    public boolean isDriver() {
        return isDriver;
    }

    public void setDriver(boolean driver) {
        isDriver = driver;
    }

    public boolean isAircraft() {
        return isAircraft;
    }

    public void setAircraft(boolean aircraft) {
        isAircraft = aircraft;
    }
}
