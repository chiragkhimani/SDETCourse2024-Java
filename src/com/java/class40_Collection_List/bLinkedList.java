package com.java.class40_Collection_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class bLinkedList {
    public static void main(String[] args) {

        LinkedList<String> name = new LinkedList();

        name.add("Francis");
        name.add("Dauren");
        name.add("Aysha");

        System.out.println(name);

        name.addFirst("Iliana");
        System.out.println(name);

        name.addLast("Shyam");
        System.out.println(name);

        name.removeFirst();
        System.out.println(name);

        name.removeLast();
        System.out.println(name);

        name.remove(1);
        System.out.println(name);






    }


}
