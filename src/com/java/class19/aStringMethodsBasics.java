package com.java.class19;

public class aStringMethodsBasics {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = "hello";

//        1. Equality of Strings
        System.out.println(str1==str2); //True
        System.out.println(str1==str3); //False
        System.out.println(str1.equals(str3)); //True
        System.out.println(str1.equalsIgnoreCase(str4)); //True

//        2. Contains
        String str5 = "Hello everyone, can you spell potato";
        System.out.println(str5.contains(str1)); //true
        System.out.println(str5.contains(str4)); //false

//        3. To convert the case
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toLowerCase().equals(str4)); //true

//        4. Check the String is empty or not
        String str6 = ""; //"      "
        System.out.println(str6.isEmpty());
        System.out.println(str6.isBlank());

//        5. length of String
        System.out.println(str1.length());

//        6. Find char at particular index
//        String str1 = "Hello";
        System.out.println(str1.charAt(4));
        System.out.println(str1.charAt(str1.length()-1));

//        7. Find char at particular index
        System.out.println(str1.indexOf("o")); //4
        System.out.println(str1.indexOf("l")); //2, 2,
        System.out.println(str1.indexOf("z")); //-1

//        String str5 = "Hello everyone, can you spell potato";
        System.out.println(str5.indexOf("everyone"));//6
        System.out.println(str5.indexOf("everyone898"));// -1

        String str7 = "         ";
        System.out.println(str7.isBlank());
        System.out.println(str7.length());
        System.out.println(str7.contains(" ")); //T
        System.out.println(str7.indexOf(" ")); //0

    }




}
