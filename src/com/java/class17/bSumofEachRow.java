package com.java.class17;

public class bSumofEachRow {
    public static void main(String[] args) {
        //input
        int num[][] = {{10,20,30}, {40,50,60,100}, {70,80,90}};
//        int sum =0;

        //logic
        for (int i = 0; i < num.length ; i++) {
            int sum =0;
            for (int j = 0; j < num[i].length; j++) {
                sum = sum +num[i][j];
            }
            System.out.println("Sum of Row " + i + "= " + sum);
//            sum=0;
        }

        //output
//        Sum of Row 0 =60
//        Sum of Row 1 =250
//        Sum of Row 2 =240


    }

}
