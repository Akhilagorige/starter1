/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,num,sum=0, i; 
        //create scanner object to obtain input from keyboard 
        Scanner input =new Scanner(System.in); 
        //input 
        n =input.nextInt(); //read total numbers 
         
        for(i=1;i<=n; i++) 
            { 
                 num=input.nextInt(); //input number 
                 sum += num; 
            } 
         int average=(int)sum/n; 
         System.out.println(+ average); 
         // your code goes here
	}
}
