package com.java.class20;

public class bCheckAnagram1 {
    public static void main(String[] args) {

        String str1 = "silent";
        String str2 = "listen";  //night == thing, taste == state
        int count = 0;

        //Condition
//        1. Every letter should be used
//        2. length should be same
        //Logic

        for (int i = 0; i < str1.length(); i++) {

            if (str1.length() == str2.length()) {

                if (str2.indexOf(str1.charAt(i)) != -1) {
                    count++;
                }
            }
        }
        System.out.println(count);

        //Output
        if (count==str1.length()) {
            System.out.println("The given String are Anagram");
        } else {
            System.out.println("The given String are not Anagram");
        }


    }


}
