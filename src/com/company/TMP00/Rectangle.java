package com.company.TMP00;

public class Rectangle {
    private int Width, Height;

    public Rectangle() {
        this.Width = 0;
        this.Height = 0;
    }

    public void setArea(int width, int height) {
        this.Width = width;
        this.Height = height;
    }

    public int getArea() {
        return this.Width * this.Height;
    }
}
