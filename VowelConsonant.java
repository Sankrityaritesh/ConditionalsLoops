package com.ritesh;

import java.util.Scanner;

public class VowelConsonant
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any character");
        char ch = in.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.println("Vowel");
        } else{
            System.out.println("Consonant");
        }
    }
}
