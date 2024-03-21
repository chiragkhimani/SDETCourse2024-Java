package com.java.class41_Set_and_Map;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class aSetEg {

    public static void main(String[] args) {
        Set<Integer> data = new HashSet<>();

// ========================1. Adding Elements==========================================
        data.add(20);
        data.add(10);
        data.add(30);
        data.add(100);
        data.add(500);
        data.add(40);
        data.add(20);

        System.out.println(data);
        System.out.println(data.contains(40));

        //2. Merge two Array - addAll Method
        Set<Integer> data1 = new HashSet<>();
        data1.add(2000);
        data1.add(1000);
        data1.add(3000);
        data1.add(1000);
        System.out.println("data1 " + data1);

        data1.addAll(data);
        System.out.println("data1 merged with data " + data1);

        //3. Retrieve -- WE Can not use get method with set

        //4. Print all data
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
