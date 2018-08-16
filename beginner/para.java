/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s=new Scanner(System.in);
	String sr=s.nextLine();
	int len=0;
	int worldlen=1;
	len=sr.length();
	for(int i=0;i<len;i++)
	{
		if(sr.charAt(i)=='.')
		worldlen++;
	}// your code goes here
	
		System.out.println(worldlen);
	}
}
