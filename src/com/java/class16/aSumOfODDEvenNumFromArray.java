package com.java.class16;

public class aSumOfODDEvenNumFromArray {

    public static void main(String[] args) {

        int num[] = {10, 21, 33, 40, 55, 60};
        int sumEven = 0;
        int sumODD = 0;

        for (int i : num) {
            if (i % 2 == 0) {
                sumEven = sumEven + i;

            } else {
                sumODD = sumODD + i;

            }
        }
        System.out.println(sumEven);
        System.out.println(sumODD);

    }
}
