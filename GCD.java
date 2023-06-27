package com.ritesh;

import java.util.Scanner;

public class GCD{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any two Numbers");
        int a = in.nextInt();
        int b = in.nextInt();

        for (int i=1;i<=a;i++){
            if (a%i==0&&b%i==0)
                System.out.println(i);
        }
    }
}
