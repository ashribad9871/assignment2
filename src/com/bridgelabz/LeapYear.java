package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the year which you want to check is leap year or not : ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean leap;

        if(year % 4 == 0) {               // if year divided by 4
            if (year % 100 == 0) {        // if year is a century
                if (year % 400 == 0)      // if the year divided by 400 then it's a leap year
                    leap = true;
                else
                    leap = false
            } else                        // if the year is not a century
                leap = true;
        } else                            // if the year is not divided by 4
            leap = false;

        if(leap)
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
    }
}
