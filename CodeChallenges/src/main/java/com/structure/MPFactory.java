package com.structure;

public class MPFactory {

    public MP getMPInstance(String type, Integer spending){
        if(type.equalsIgnoreCase("MP")){
            return new MP(spending);
        }
        else if(type.equalsIgnoreCase("PM")){
            return new PM(spending);
        }
        else return new Minister(spending);

    }
}
