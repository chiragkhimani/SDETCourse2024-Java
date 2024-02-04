package com.java.class10;

public class ReverseNum2 {

    public static void main(String[] args) {

        int num = 12345;
        int revNum = 0;

        while (num > 0) {
            revNum = revNum*10 +num % 10; //4
            num = num / 10;
        }
        System.out.println(revNum);
    }
}
