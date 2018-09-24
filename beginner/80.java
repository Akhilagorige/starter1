/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner in=new Scanner(System.in);
    int no=in.nextInt();
    String s=Integer.toString(no);
    char a[]=s.toCharArray();
    for(int i=0;i<s.length();i++)
    if(a[i]%2!=0)
    {
        System.out.print(" "+a[i]);
    }	// your code goes here
	}
}
