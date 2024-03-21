package com.java.class41_Set_and_Map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class bTreeSetEg {

    public static void main(String[] args) {
        Set<Integer> data = new TreeSet<>();

// ========================1. Adding Elements==========================================
        data.add(20);
        data.add(10);
        data.add(30);
        data.add(100);
        data.add(500);
        data.add(40);
        data.add(20);

        System.out.println(data);

        //2. Print all data
        System.out.println("Data with For Each Loop");
        for (int num : data) {
            System.out.println(num);
        }

        System.out.println("Data with Iterator");
        Iterator i = data.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());


        }





    }
}
