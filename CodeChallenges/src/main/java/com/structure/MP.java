package com.structure;

public class MP {

    protected int getSpendingLimit() {
        SpendingLimit spendingLimit = new SpendingLimit(this);
        return spendingLimit.getSpendingLimit();
    }

    protected Vehicle getVehicle(){
        Vehicle vehicle = new Vehicle(this);
        return vehicle;
    }


}
