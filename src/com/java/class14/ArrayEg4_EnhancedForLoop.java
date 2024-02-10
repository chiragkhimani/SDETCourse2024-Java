package com.java.class14;

public class ArrayEg4_EnhancedForLoop {

    public static void main(String[] args) {

        int num[] = {5,9,97,89,6,7,8,10};

//        for (int i = 0; i < num.length; i++) {
//            System.out.println(num[i]);
//        }

        for (int printNum:num) {
            System.out.println(printNum);
        }
    }
}
