/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int i = 0;
      int n = 0;

      Scanner input = new Scanner(System.in);

         System.out.print("Enter i: ");
         i = input.nextInt();
         System.out.print("Enter n: ");
         n = input.nextInt();

         if ((i <= 1) || (n <= 1)) {
            System.out.println("Please enter numbers above 1");
            System.exit(1);
         }

         System.out.print(n + " multiples of " + i + " are: ");
  for (int counter = 0 ; counter < n ; counter++) {
    System.out.print(i*(2 + counter) + " ");

   	// your code goes here
	}
}}
