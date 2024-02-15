package com.java.class16;

import java.util.Scanner;

public class dCheckArrayisSorted {
    public static void main(String[] args) {

        //1. Size of Array from User
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = sc.nextInt();
        int num[] = new int[size];

        //2. Element of Array from User
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter the element " + i);
            num[i] = sc.nextInt();
        }

        //Condition    //0 to 5 - 6   01, 12, 23, 34,45 5&6
        int count = 0;
        for (int i = 0; i < num.length - 1; i++) {  //0  ,1, 2
            if (num[i] > num[i + 1]) {          //0&1 ,1&2, 2&3
                count = 1;
            }
        }
        //Output
        //4. Final Result
        if (count == 0) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }

    }
}