package com.company;
//import java.lang.String;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        System.out.println(" Introduceti un numar integer : ");
        Scanner num1 = new Scanner(System.in);
        int i1;
        float i2,i3;
        i1 = num1.nextInt();
        System.out.println(" Introduceti un numar float : ");
        Scanner num2 = new Scanner(System.in);
        i2 = num2.nextFloat();
        i3 = i2 + i1;
        System.out.println("Suma este: " + i3 );
        

    }
}