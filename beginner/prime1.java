/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int low=2,high=10;
	while(low<high)
	{
		boolean b=false;
		for(int i=2;i<=low/2;++i)
		{
			if(low%i==0)
			{
				b=true;
				break;
			}
		}
		if(!b)
		{
			System.out.println(low+" ");
		}
		++low;
	}
	}
}
