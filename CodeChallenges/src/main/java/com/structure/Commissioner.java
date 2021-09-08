package com.structure;

public class Commissioner {

    public static boolean canArrest(MP mp){
        if(mp.getSpending() > mp.getSpendingLimit() && !(mp instanceof PM) && PM.getPermission()){
            return  true;
        }
        return false;
    }
}
