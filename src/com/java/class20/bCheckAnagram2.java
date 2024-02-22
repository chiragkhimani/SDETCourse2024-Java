package com.java.class20;

import com.java.class22.MethodMasterEg;

import java.util.Arrays;

public class bCheckAnagram2 {
    public static void main(String[] args) {

        String str1 = "silent";
        String str2 = "listen";  //night == thing, taste == state

//        1 Convert to Char Array
        char c1[] = str1.toCharArray();
        char c2[] = str2.toCharArray();

        // 2. Sorting the char array

        Arrays.sort(c1);
        Arrays.sort(c2);

        //3. Convert Char Array to String
        String str3 = new String(c1);
        String str4 = new String(c2);

        //Output
        if (str3.equalsIgnoreCase(str4)) {
            System.out.println("The given String are Anagram");
        } else {
            System.out.println("The given String are not Anagram");
        }


    }


}
