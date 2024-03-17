package com.java.class39_CollectioninJava;

import java.util.*;

public class cCollectioEg1 {
    public static void main(String[] args) {

        int a[] = new int[7];

        List<Integer> data = new ArrayList<>();  //[10,20,30]

        data.add(10);
        data.add(20);
        data.add(30);
        data.add(40);
//       data.add("Dinora");

        //To print whole array
        System.out.println(data);

        //To print separate array element
        for (int num :data){
            System.out.println(num*2);
        }

    }

}
