package com.java.class14;

public class FindMaxNumFromArray {

    public static void main(String[] args) {

        int num[] = {10,90,20,70,600,40,100,1420};
        int maxNum=0;

        //Logic
        for (int eachNum:num) {
            if (eachNum>maxNum) {
                maxNum=eachNum;
            }
        }
        System.out.println(maxNum);

        //output -->> 600


    }
}
