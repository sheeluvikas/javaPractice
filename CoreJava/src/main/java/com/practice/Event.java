package com.practice;

import java.util.ArrayList;
import java.util.List;

public class Event {

    public List<Location> getLocations() {
        List<Location> locations = new ArrayList<>();
        locations.add(new Location("A   "));
        locations.add(new Location("B "));
        locations.add(new Location("    C"));
        locations.add(new Location("D "));

        return locations;
    }
}
