package com.bridge.basiccoreprograms;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Alphabet Character");
        int y=sc.next().charAt(0);
        if (y == 'a' || y == 'e' || y == 'i' || y == 'o'|| y == 'u'||
                y == 'A' || y == 'E' || y == 'I' || y == 'O'|| y == 'U')
            System.out.println("It is a Vowel");
        else
            System.out.println("It is a Consonant");
    }
    }


