package com.java.class14;

public class CountApple {

    public static void main(String[] args) {

        String fruits[] = {"apple", "apple", "orange", "kiwi"};
        int count = 0;

        for (int i = 0; i <fruits.length ; i++) {
            if (fruits[i]=="apple"){
                count++;

            }
        } System.out.println(count);


//        for (String eachFruit : fruits) {
//            if (eachFruit == "apple") {
//                count++;
//            }
//        }
//        System.out.println(count);

    }
}