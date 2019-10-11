package com.company.TMP00;

public class BoxDesign extends BoxGeometry {
    private String Color;

    public BoxDesign() {
        //super();
        this.Color = "black";
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public String getColor() {
        return Color;
    }
}
