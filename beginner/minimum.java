/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
		// Java Program to find maximum in arr[] 
class Test
{
     static int arr[] = {10, 324, 45, 90, 9808};
      
     // Method to find maximum in arr[]
     static int minimum()
     {
         int i;
          
         // Initialize maximum element
         int min = arr[0];
       
         // Traverse array elements from second and
         // compare every element with current max  
         for (i = 1; i < arr.length; i++)
             if (arr[i] < min)
                 min = arr[i];
       
         return min;
     }
      
     // Driver method
     public static void main(String[] args) 
     {
         System.out.println( minimum());
        }
 }
// your code goes here
	
