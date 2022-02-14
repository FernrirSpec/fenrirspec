package com.company;

public class Triangle implements Shape {
    double aSide;
    double bSide;
    double cSide;
    double square;
    double height;
    double p;

    String return1;
    String return2;
    String return3;
    String return4;

    public double perim() {
        return p = (aSide + bSide + cSide) / 2;
    }

    @Override
    public double getSquare() {
        return square = Math.sqrt(perim() * (perim() - aSide) * (perim() - bSide) * (perim() - cSide));
    }

    public double findHeight() {
        return height = (2 * getSquare()) / aSide;
    }

    public String returning() {
        this.return1 = Double.toString(perim());
        this.return2 = Double.toString(getSquare());
        this.return3 = Double.toString(findHeight());

        return return4 =  "Triangle{" + "Half-Perimetr = " + return1 + "; Square of Triangle = " + return2 + "; Height = " + return3 + "}";
    }

}
