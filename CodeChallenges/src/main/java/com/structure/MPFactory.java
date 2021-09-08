package com.structure;

public class MPFactory {

    public MP getMPInstance(String type){
        if(type.equalsIgnoreCase("MP")){
            return new MP();
        }
        else if(type.equalsIgnoreCase("PM")){
            return new PM();
        }
        else return new Minister();

    }
}
