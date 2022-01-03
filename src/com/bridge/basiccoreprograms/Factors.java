package com.bridge.basiccoreprograms;

import java.util.Scanner;

public class Factors {
    public static void main(String args[]){
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int start=1;
        int factorialNumber=sc.nextInt();
        for(int i=1;i<=factorialNumber;i++){
            start=start*i;
        }
        System.out.println("Factorial for "+factorialNumber+" is: "+start);*/

        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ::");
        number = sc.nextInt();

        for(int i = 2; i< number; i++) {
            while(number%i == 0) {
                System.out.println(i+" ");
                number = number/i;
            }
        }
        if(number >2) {
            System.out.println(number);
        }
    }
}
