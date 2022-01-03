package com.bridge.basiccoreprograms;

import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int number1 = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int number2 = sc.nextInt();
        System.out.print("Enter Third Number : ");
        int number3= sc.nextInt();
        if( number1 >= number2  && number1 >= number3)
            System.out.println(number1 + " is the largest number.");

        else if (number2  >= number1 && number2  >= number3)
            System.out.println(number2  + " is the largest number.");

        else
            System.out.println(number3 + " is the largest number.");
    }
}

