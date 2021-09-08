package com.structure;

public class PoliticalDemo {

    public static void main(String[] args) {
        String MPType = "MP";
        MPFactory mpFactory = new MPFactory();
        MP mp = mpFactory.getMPInstance(MPType, 20000);

        System.out.println("Spending Limit " + mp.getSpendingLimit());
        System.out.println("is Aircraft : " + mp.getVehicle().isAircraft());
        System.out.println("Actual Spending : " + mp.getSpending());
        System.out.println("to be arrested : " + Commissioner.canArrest(mp));
    }
}
