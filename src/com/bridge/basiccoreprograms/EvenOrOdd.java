package com.bridge.basiccoreprograms;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check whether number is even or odd");
        int number=sc.nextInt();
        System.out.println("Mod result is :"+ number%2);
        if(number%2==0) {
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
    }
}
