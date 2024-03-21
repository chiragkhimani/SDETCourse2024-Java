package com.java.class41_Set_and_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class dTreeMapEg {

    public static void main(String[] args) {
        Map<String, Integer> data = new TreeMap<>();

// ========================1. Adding Elements==========================================
        data.put("Francis", 100);
        data.put("Illiana", 0);
        data.put("Dauren", 500);
        data.put("Ardenis", 20);
        data.put("Ardenis", 80);
        data.put("Dinora", 100);
        data.put("Aysha", 90);

        System.out.println(data);

        System.out.println(data.get("Ardenis"));


    }
}
