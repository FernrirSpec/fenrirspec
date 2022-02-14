package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean val1 = true;

        do {
        System.out.println("TRIANGLE: ");
        Triangle one = new Triangle();

        System.out.println("Enter AB side: ");

        do {
            while (!in.hasNextDouble())
                    {
                        System.err.println("Incorrect value try again! ");
                        in.next();
                    }
                    one.aSide = in.nextDouble();
                }while (one.aSide < 0);

            System.out.println("Enter BC side: ");

        do {
            while (!in.hasNextDouble())
            {
                System.err.println("Incorrect value try again! ");
                in.next();
            }
            one.bSide = in.nextDouble();
        }
        while (one.bSide < 0);

            System.out.println("Enter CA side: ");

        do {
            while (!in.hasNextDouble())
            {
                System.err.println("Incorrect value try again! ");
                in.next();
            }
            one.cSide = in.nextDouble();
        }while (one.cSide < 0);

        if(one.aSide + one.bSide >= one.cSide){
            if(one.bSide + one.cSide >= one.aSide) {
                if (one.aSide + one.cSide >= one.bSide) {
                    System.out.println("Results: ");
                    System.out.println(one.returning());
                    val1 = false;
                }
                else {
                    System.out.println("Triangle does not exist! Please enter correct values! ");

                }

            }
            else {
                System.out.println("Triangle does not exist! Please enter correct values! ");

            }
        }
        else {
            System.out.println("Triangle does not exist! Please enter correct values! ");

        }

        }while (val1);


        System.out.println("SQUARE: ");
        Square sec = new Square();
        System.out.println("Enter Square side: ");
        do {
            while (!in.hasNextDouble())
            {
                System.err.println("Incorrect value try again! ");
                in.next();
            }
            sec.aSide = in.nextDouble();
        }while (sec.aSide < 0);

        System.out.println("Results: ");
        System.out.println(sec.returning());

        System.out.println("CIRCLE: ");
        Circle third = new Circle();

        System.out.println("Enter length of circle: ");
        do {
            while (!in.hasNextDouble())
            {
                System.err.println("Incorrect value try again! ");
                in.next();
            }
            third.length = in.nextDouble();
        }while (third.length < 0);

        System.out.println("Results: ");
        System.out.println(third.returning());

    }
}
