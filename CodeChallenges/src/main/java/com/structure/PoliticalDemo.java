package com.structure;

public class PoliticalDemo {

    public static void main(String[] args) {
        String MPType = "MP";
        MPFactory mpFactory = new MPFactory();
        MP mp = mpFactory.getMPInstance(MPType);

        System.out.println("Spending Limit " + mp.getSpendingLimit());
        System.out.println("is Aircraft : " + mp.getVehicle().isAircraft());

    }
}
