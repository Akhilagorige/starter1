/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	String c=sc.next();
	String c1=sc.next();
	if(c.length()>c1.length())
	{
		System.out.println(c);
		
	}
	else if(c.length()<c1.length())
	{
		System.out.println(c1);
		// your code goes here
	}
	else
	{
		System.out.println(c1);
		
	}
}
}
