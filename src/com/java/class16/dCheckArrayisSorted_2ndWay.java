package com.java.class16;

import java.util.Scanner;

public class dCheckArrayisSorted_2ndWay {
    public static void main(String[] args) {
        //input
        int num[] = {0,1,2,4,3,5};

        //2. Logic    //0 to 5 - 6   01, 12, 23, 34,45 5&6
        boolean isAscending = true;
                for (int i = 0; i < num.length - 1; i++) {  //0  ,1, 2
            if (num[i] > num[i + 1]) {          //0&1 ,1&2, 2&3
                isAscending=false;
            }
        }

        //3. Output
        if (isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }

    }
}