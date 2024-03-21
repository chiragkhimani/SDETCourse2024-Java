package com.java.class41_Set_and_Map;

import java.util.*;

public class cMapEg {

    public static void main(String[] args) {
        Map<String, Integer> data = new HashMap<>();

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

        System.out.println(data.keySet());
        System.out.println(data.values());

        for (String key : data.keySet()) {
            System.out.println(key + ": " + data.get(key));
        }

        Iterator i = data.entrySet().iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}
