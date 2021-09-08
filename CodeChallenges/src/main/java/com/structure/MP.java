package com.structure;

public class MP {

    private int spending;

    public MP(int spending) {
        this.spending = spending;
    }

    public int getSpending() {
        return spending;
    }

    public void setSpending(int spending) {
        this.spending = spending;
    }

    protected int getSpendingLimit() {
        SpendingLimit spendingLimit = new SpendingLimit(this);
        return spendingLimit.getSpendingLimit();
    }

    protected Vehicle getVehicle(){
        Vehicle vehicle = new Vehicle(this);
        return vehicle;
    }


}
