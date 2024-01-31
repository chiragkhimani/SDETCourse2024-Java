package com.java.class06;

public class LargestFromThreeNum {
    public static void main(String[] args) {

        int a = 30, b = 20, c = 40;

        if (a>b){
                if (a>c) {
                    System.out.println("A is the greatest num");
                }else {
                    System.out.println("C is the greatest num");
                }

        }else {
            if (b>c) {
                System.out.println("B is the greatest num");
            }else {
                System.out.println("C is the greatest num");
            }
        }


    }

}
