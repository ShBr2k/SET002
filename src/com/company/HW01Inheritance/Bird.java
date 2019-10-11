package com.company.HW01Inheritance;

public abstract class Bird {
    private String Name;
    private boolean Feathers;
    private boolean LayEggs;
    public abstract boolean fly();

    public Bird() {
        Feathers = true;
        LayEggs = true;
    }

    public void setName (String name) {
        Name = name;
    }

    public boolean getFeathers () {
        return Feathers;
    }

    public boolean getLayEggs () {
        return LayEggs;
    }

    public String getName () {
        return Name;
    }
}





