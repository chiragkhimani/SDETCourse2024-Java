package com.java.class19;

public class bStringMethodsAdvance {

    public static void main(String[] args) {

//        1. Trim
        String str1 = "   Hello   ";
        System.out.println(str1);
        System.out.println(str1.trim());

        String str2 = "   Hello World  ";
        System.out.println(str2.trim());

//        2. Replace
        String str3 = "You have to pay 30, and we will give you 100 back";
        System.out.println(str3.replace("30", "100"));
        System.out.println(str3.replace(" ", ""));

//        3. Substring
        System.out.println(str3.indexOf("pay"));
        System.out.println(str3.substring(15));

        System.out.println(str3.substring(15,49));
        System.out.println(str3.length());

//        4. Format
        String str4 = "You have to pay %s, and we will give you 100 back";
        System.out.println(String.format(str4, "100"));

        String str5 = "You have to pay %s, and we will give you %s back";
        System.out.println(str5);
        System.out.println(String.format(str5, "%s", "50"));

        //5. Split
        String str6 = "You have to pay 30, and we will give you 100 back";
        String splitStr6[]  = str6.split(" ");

        System.out.println(splitStr6[splitStr6.length-1]); //to print last word

        for (int i=0; i<splitStr6.length; i++){
            System.out.println(splitStr6[i]);
        }



    }

}
