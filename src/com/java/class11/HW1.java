package com.java.class11;


//1. Int num 12345
//
// Output = Separate Digit: 1, 2, 3, 4, 5
public class HW1 {

    public static void main(String[] args) {

        int num = 12345; //54321
        int revNum = 0;

        // To Reverse the number
        while (num > 0) {
            revNum = revNum*10 +num % 10; //4
            num = num / 10;
        }

        //To separate digit from reverse number
        while (revNum > 0) {
            System.out.println(revNum%10);
            revNum = revNum / 10;
        }



    }


}
