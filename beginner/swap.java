/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num1,num2;
		Scanner scanner=new Scanner(System.in);
	
		num1=scanner.nextInt();
			num2=scanner.nextInt();
			num1=num1^num2;
			num2=num1^num2;
			num1=num1^num2;
			scanner.close();
			System.out.println(num1+" "+num2);
			}// your code goes here
	}
