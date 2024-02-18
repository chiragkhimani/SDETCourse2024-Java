package com.java.class20;

public class aCheckPalindrome {

    public static void main(String[] args) {

        String originalString = "Naman";
        String reverseString = "";

        for (int i = originalString.length() - 1; i >= 0; i--) {
            reverseString = reverseString + originalString.charAt(i);

        }

        if (originalString.equalsIgnoreCase(reverseString)) {
            System.out.println(reverseString + " is a palindrome");
        } else {
            System.out.println(reverseString + " is not a palindrome");
        }
    }

}
