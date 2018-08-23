/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int temp;
	boolean isPrime=true;
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	s.close();
	for(int i=2;i<=num/2;i++)
	{
		temp=num%1;
		if(temp==0)
		{
			isPrime=false;
			break;
			
		}
	}
	if(isPrime)
	System.out.println("yes");
	else
	System.out.println("no");
	// your code goes here
	}
}
