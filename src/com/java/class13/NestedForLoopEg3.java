package com.java.class13;

public class NestedForLoopEg3 {

/*     1
      12
     123
    1234
   12345
 */
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {  //R-5

            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }

            for (int l = 1; l <= i; l++) {
                System.out.print("*"); //i=1
            }
            System.out.println();
        }

    }

}
