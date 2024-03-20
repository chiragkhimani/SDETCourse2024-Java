package com.java.class40_Collection_List;

import java.util.*;

public class aArrayList {
    public static void main(String[] args) {
//        Normal Array
//        int a[] = new int[7];

        //import java.util.*; to work with List
        List<Integer> data = new ArrayList<>();  //[10,20,30]


// ========================1. Adding Elements==========================================
        data.add(10);
        data.add(20);
        data.add(30);
        data.add(40);
//       data.add("Dinora");

// ========================2. Retrieve Elements==========================================

        //Retrieve element based on index
        System.out.println(data.get(1)); //20

        //Retrieve index based on value
        System.out.println(data.indexOf(20)); //1

        System.out.println(data);
        data.add(1, 15);
        System.out.println(data);

        System.out.println(data.indexOf(20));

// ========================3. Remove Elements==========================================
        data.remove(1);
        System.out.println(data);

        //Remove all
//        data.removeAll(data);
//        data.clear();
        System.out.println(data);

// ========================4. Checking the ArrayList==========================================

        System.out.println(data.size());
//        data.clear();
        System.out.println(data.isEmpty());
        System.out.println(data.contains(40));


// ========================5. print all Elements==========================================
        //To print whole array
        System.out.println(data);


        //To print separate array element
        System.out.println("====Using Enhanced For Loop======");
        for (int num : data) {
            System.out.println(num); //
        }

        //To print separate array element
        System.out.println("====Using Iterator======");
        Iterator itr = data.iterator();
        // [10, 20, 30, 40]

        while (itr.hasNext()){
            System.out.println(itr.next());
            System.out.println(itr.hasNext());
        }

    }

}
