package com.company.TMP00;

public class BoxGeometry {
    private int Width, Heigh, Depth;

    public BoxGeometry() {
        Width = 0;
        Heigh = 0;
        Depth = 0;
    }

    public void setDim(int width, int heigh, int depth) {
        this.Width = width;
        this.Heigh = heigh;
        this.Depth = depth;
    }

    public int getVolume() {
        return Width * Heigh * Depth;
    }


}
