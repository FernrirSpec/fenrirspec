package com.company;

public class Square implements Shape {
    double aSide;
    double diagonal;
    double per;
    double p;
    double square;

    String return1;
    String return2;
    String return3;
    String return4;

        public double per(double aSide)
        {
            return  per = aSide * 4;
        }

        public double pPerimetre(double aSide)
        {
           return p = (aSide * 4) / 2;
        }

        public double diagonal()
        {
            return diagonal = aSide*Math.sqrt(2);
        }

    @Override
    public double getSquare()
    {
            return square = aSide * aSide;
    }

    public String returning()
    {
        this.return1 = Double.toString(getSquare());
        this.return2 = Double.toString(diagonal());
        this.return3 = Double.toString(per(aSide));

        return return4 = "Square{" + " Square of Square = " + return1 + "; Length of Diagonal = " + return2 + "; Perimetre = " + return3 + "}";
    }
}
