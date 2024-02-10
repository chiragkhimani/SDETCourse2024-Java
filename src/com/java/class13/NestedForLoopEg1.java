package com.java.class13;

public class NestedForLoopEg1 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {  //R-1
            System.out.print("Hello ");

            for (int j = 1; j <= 5; j++) {
                System.out.print(i); //i=1
            }
            System.out.println();
        }

    }

}
