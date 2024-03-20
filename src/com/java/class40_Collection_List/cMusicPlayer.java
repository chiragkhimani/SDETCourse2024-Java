package com.java.class40_Collection_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class cMusicPlayer {
    public static void main(String[] args) {

        // Playlist using ArrayList (good for random access)
        List<String> musicPlyalist = new ArrayList<>();
        musicPlyalist.add("1. Hozier");
        musicPlyalist.add("2. John Legend");
        musicPlyalist.add("3. Instasamka");
        musicPlyalist.add("4. Unstoppable");

        // Play a random song (useful with random access)
        int random = (int)(Math.random()*musicPlyalist.size());
        System.out.println(musicPlyalist.get(random));

        // Playlist using LinkedList (good for frequent insertions/deletions)
        LinkedList<String> upcomingMusic = new LinkedList();
        upcomingMusic.addFirst("5. Hozier");
        upcomingMusic.add("6. Moye moye");

        // Add a new song to the queue (efficient with LinkedList)
        upcomingMusic.addLast("7. Unstoppable");


        // Iterate through the LinkedList and print songs (order matters)
        for (String music :upcomingMusic) {
            System.out.println(music); //
        }

    }



}
