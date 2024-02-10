package com.java.class13;

public class NestedForLoopEg2 {

/* 1
   12
   123
   1234
   12345
 */
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {  //R-5

            for (int j = 1; j <= i; j++) {
                System.out.print(j); //i=1
            }
            System.out.println();
        }

    }

}
