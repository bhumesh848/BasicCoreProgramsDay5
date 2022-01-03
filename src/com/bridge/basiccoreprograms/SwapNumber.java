package com.bridge.basiccoreprograms;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number");
        int value1 =sc.nextInt();
        int value2 =sc.nextInt();
        System.out.println("Value before swap : number1 = " + value1 + "; number2 = " + value2);
        int tmp=value1;
        value1=value2;
        value2=tmp;
        System.out.println("Value after  swap : number1 = " + value1 + "; number2 = " + value2);

    }
}
