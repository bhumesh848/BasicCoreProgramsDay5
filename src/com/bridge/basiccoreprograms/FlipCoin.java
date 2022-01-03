package com.bridge.basiccoreprograms;

import java.util.Scanner;

public class FlipCoin {
    public static final int HEAD=0;
    public static final int TAIL=1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of times coins to be flipped");
        int number = sc.nextInt();
        int headCount = 0;
        int tailCount = 0;
        while (number > 0) {
            int result = (int) (Math.random() * 10 % 2);
            if(result==HEAD){
                headCount++;
            }
            else{
                tailCount++;
            }
            number--;
        }
        System.out.println("Total Head count :"+headCount);
        System.out.println("Total Tails count :"+tailCount);
        double percentage=(headCount*100)/tailCount;
        System.out.println("Percentage of Head vs Tails :"+percentage+"%");
    }
}

