package com.java.class22;

public class MethodsHW2 {

    public static void main(String[] args) {
        Summation(20,10); //

    }

    public static void Summation(int a, int b){
       int sum = 0;

       if (a<b) {

           for (int i = a; i <= b; i++) {
               sum = sum + i;
           }
           System.out.println("The sum of given numbers: " + sum);
       }else{

           for (int i = a; i >=b; i--) {
               sum = sum + i;
           }
           System.out.println("The sum of given numbers: " + sum);

       }
    }

}
