package com;
import java.util.ArrayList;
import java.util.List;
public class ListToArrayExample2 {
    


public class ListToArrayExample {
    
    public static void main(String[] args) {
         // Create a List of Interger

         List<Insteger> list = new ArrayList<>();
         list.add("Apple");
         list.add("Banana");
         list.add("Orange");
         
         
         

         // Convert List to an Array
           String[] array = new String[list.size()];
           array = list.toArray(array);

           // Print the elements of the array

           System.out.println("Elements of the array:");
           for (String  item  :  array) {
            System.out.println(item);
           }
    }
}
}