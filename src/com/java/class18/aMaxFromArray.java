package com.java.class18;

public class aMaxFromArray {
    public static void main(String[] args) {
        //input
        int num[][] = {{10, 20, 30}, {40, 50, 60, 100}, {70, 80, 90}};
        int maxNum = num[0][0];

        //logic
        for (int i = 0; i < num.length; i++) {
                        for (int j = 0; j < num[i].length; j++) {
                             if (maxNum < num[i][j]) {
                    maxNum = num[i][j];

                }
            }

        }
        System.out.println(maxNum);


        //output


    }

}
