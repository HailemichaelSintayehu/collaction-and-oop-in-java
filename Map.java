
 // Hashing is a technique of converting a large String to a small String that represents the same String. A shorter value helps in indexing and faster searches.

 // Java Program to Demonstrate
// Working of Map interface

// Importing required classes
 import java.util.*;

 // Main class
 class MapTest {

     // Main driver method
     public static void main(String args[])
     {
         // Creating an empty HashMap
         Map<String, Integer> hm
                 = new HashMap<String, Integer>();

         // Inserting pairs in above Map
         // using put() method
         hm.put("a", new Integer(100));
         hm.put("b", new Integer(200));
         hm.put("c", new Integer(300));
         hm.put("d", new Integer(400));

         // Traversing through Map using for-each loop
         for (Map.Entry<String, Integer> me :
                 hm.entrySet()) {

             // Printing keys
             System.out.print(me.getKey() + ":");
             System.out.println(me.getValue());
         }
     }
 }
