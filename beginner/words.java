/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

	class WordCount
{ 
	public static void main(String args[])
	{ 
		String s = "hello world";
 
		int count = 1;
 
		for (int i = 0; i < s.length() - 1; i++)
		{
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
			{
				count++;
 
			}
		}
 		System.out.println( + count);
	}
}
	// your code goes here
	
