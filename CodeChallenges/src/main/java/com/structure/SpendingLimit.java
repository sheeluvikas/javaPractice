package com.structure;

public class SpendingLimit {

    private int spendingLimit;

    public SpendingLimit(MP mp){
        if(mp instanceof PM){
            this.setSpendingLimit(10000000);
        }
        else if(mp instanceof Minister){
            this.setSpendingLimit(1000000);
        }
        else this.setSpendingLimit(100000);
    }

    public int getSpendingLimit() {
        return spendingLimit;
    }

    public void setSpendingLimit(int spendingLimit) {
        this.spendingLimit = spendingLimit;
    }
}
