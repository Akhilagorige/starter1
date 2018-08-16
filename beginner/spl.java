/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int i,l,c1=0,c2=0,c3=0,sp=0,p=0;
char ch;
l=str.length();
for(i=0;i<l;i++)
{
ch=str.charAt(i);
if(Character.isLetter(ch))
++c1;
else if(Character.isDigit(ch))
++c2;
else if(ch==' ')
++sp;
else if(ch=='.')
++p;
else
++c3;
}
System.out.print(c3);

	}
}
