package com.ritesh;

import java.util.Scanner;
class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = in.nextInt();
        if (year % 4 == 0) {
            System.out.println("Leap Year");
        } else
            System.out.println("Not a Leap Year");
    }
}