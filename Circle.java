package com.company;

public class Circle implements Shape {

    double length;
    double diametre;
    double radius;
    double square;

    String return1;
    String return2;
    String return3;
    String return4;


    public double diam()
    {
        return diametre = length / Math.PI;
    }

    public double rad()
    {
        return radius= diametre/2;
    }

    @Override
    public double getSquare()
    {
        return square = (radius * radius) * Math.PI;
    }

    public String returning()
    {
        this.return1 = Double.toString(diam());
        this.return2 = Double.toString(rad());
        this.return3 = Double.toString(getSquare());

        return return4 = "Circle{" + " Diametre = " + return1 + "; Radius = " + return2 + "; Square of Circle = " + return3 + "}";
    }

}
