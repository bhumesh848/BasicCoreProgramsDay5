package com.bridge.basiccoreprograms;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int number = sc.nextInt();
        double a=1;
        int counter=1;
        double value=0;
        while(number>0)
        {
            value+=a/counter++;
            number--;
        }
        System.out.println("The harmonic number value is  "+value);
    }
}

