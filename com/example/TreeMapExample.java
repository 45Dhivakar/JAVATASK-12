package com.example;

import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        
        // Create a TreeMap of employee IDs And Name

        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        //Add employee IDs and names to the TreeMap

        employeeMap.put(4230, "Dhivakar");
        employeeMap.put(4231, "Gayathri");
        employeeMap.put(4232, "Gokul Kannan");
        employeeMap.put(4233, "Keerthana");

        // Print out the names of all employee in alphabetical order

        System.out.println("Name of all employees in alphabetical order:");
        for(String name : employeeMap.values()){
            System.out.println(name);
        }

    }
    
}
