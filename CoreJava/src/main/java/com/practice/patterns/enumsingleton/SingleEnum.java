package com.practice.patterns.enumsingleton;

public enum SingleEnum {
    INSTANCE("This is enum instance");
    private String description;
    SingleEnum(String value){
        this.description = value;
    }
    public SingleEnum getInstance () {
        return INSTANCE;
    }
}
