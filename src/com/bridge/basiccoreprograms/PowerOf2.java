package com.bridge.basiccoreprograms;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth power");
        int number = sc.nextInt();
        if (number>=0 && number<31){

            double value=Math.pow(2,number);
            System.out.println("The {number} power of 2 is : "+value);
        }
        else{
            System.out.println("please enter number less than 31 ");
        }

    }
}
