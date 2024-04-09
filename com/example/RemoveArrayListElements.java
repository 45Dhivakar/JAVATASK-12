package com.example;

import java.util.ArrayList;

public class RemoveArrayListElements {
    
    public static void main(String[] args) {
        
        //Create an ArrayList of strings
        ArrayList<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList

        arrayList.add("Bat");
        arrayList.add("Ball");
        arrayList.add("Stump");
        arrayList.add("Ground");

        // Print the ArrayList before removal
        System.out.println("ArrayList before removal:" +arrayList);

        // Removal all Elements from the ArrayList
        arrayList.clear();

        // Print the ArrayList after Removal
        System.out.println("ArrayList after removal:" + arrayList);

    }
    
}
