package com.java.class22;

public class MethodMasterEg {

    public static void main(String[] args) {
        //Way1
        int org_Num = 12345;
        int rev_Num = reverseNum(org_Num);
        checkPalindrome(org_Num, rev_Num); //Here we are connecting two methods.

        //Way2

        int org_Num1 = 12345;
        checkPalindrome(org_Num1, reverseNum(org_Num1)); //Here we are connecting two methods.
    }

    // This method will return the int, so you can use to check whether its palindrome.
    public  static int reverseNum(int a){
            int num = a;
            int revNum = 0;

            while (num > 0) {
                revNum = revNum*10 +num % 10; //5*10 + 4
                num = num / 10;
            }
        System.out.println(revNum);
        return revNum;
    }

    // This method will check whether its palindrome, so we need two variables, OrgNum and RevNum.
    public  static  void checkPalindrome(int org, int rev){

        if (org==rev){
            System.out.println("It is a Palindrome");
        }else {
            System.out.println("It is not a Palindrome");
        }

    }




}
