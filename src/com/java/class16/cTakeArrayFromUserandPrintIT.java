package com.java.class16;

import java.util.Scanner;

public class cTakeArrayFromUserandPrintIT {

    public static void main(String[] args) {

        //Taking input from user for single integer
        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        System.out.println(i);

        //Taking input from user for Array
        System.out.println("Please enter the size of array");
        int size = sc.nextInt();
        int num[] = new int[size];

        //input
        for (int i = 0; i < num.length; i++) {
            System.out.println("Please enter element " + i);
            num[i] = sc.nextInt();
        }

        //output
        for (int i : num)
        {
            System.out.println(i);
        }


    }

}
