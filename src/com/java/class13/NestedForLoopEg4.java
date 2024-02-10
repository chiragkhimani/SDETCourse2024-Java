package com.java.class13;

public class NestedForLoopEg4 {

/* 5
   54
   543
   5432
   54321
 */
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {  //R-5

            for (int j = 5; j > 5-i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

}
