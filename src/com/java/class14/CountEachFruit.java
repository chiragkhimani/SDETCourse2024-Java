package com.java.class14;

public class CountEachFruit {

    public static void main(String[] args) {

        String fruits[] = {"apple", "apple", "orange", "kiwi", "apple"};
        int countApple = 0;
        int countKiwi = 0;
        int countOrange = 0;

        for (int i = 0; i <fruits.length ; i++) {
            if (fruits[i]=="apple"){
                countApple++;

            } else if (fruits[i]=="orange") {
                countOrange++;
            }
            else if (fruits[i]=="kiwi") {
                countKiwi++;
            }
        }
        System.out.println(countKiwi +" Kiwi");
        System.out.println(countApple + " Apple");
        System.out.println(countOrange+" Orange");


    }
}