package com.company.TMP00;

public class Box extends Rectangle {
    private int Depth;

    public Box() {
        //super();
        this.Depth = 0;
    }

    public void setDepth(int depth) {
        this.Depth = depth;
    }

    @Override
    public int getArea () {
        return 100;
    }

    public int getVolume() {
        return getArea() * this.Depth;
    }


}
