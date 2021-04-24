package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Map
        System.out.println("================================== Map ===");

        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "hello");
        myMap.put(2, "word");

        // parcourir map 1

        for (HashMap.Entry<Integer, String> entry : myMap.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        // parcourir map 2

        Iterator iterator = myMap.values().iterator();
        Iterator iterator2 = myMap.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println("key = "+iterator2.next());
            System.out.println("objet = "+iterator.next());
        }
        System.out.println("================================== List ===");

    }
}
