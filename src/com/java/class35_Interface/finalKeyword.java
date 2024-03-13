package com.java.class35_Interface;

class Demo{

 final void test(){
        System.out.println("Created By Shyam");
    }

}


class DemoChild extends Demo{

//    @Override
//    void test(){
//        System.out.println("Created by Iliana");
//    }

}

public class finalKeyword {

    public static void main(String[] args) {

        final double PI = 3.14;

       DemoChild c = new DemoChild();
       c.test();


    }


}
