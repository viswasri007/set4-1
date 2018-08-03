import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int c=0;
		String input = sc.nextLine();
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)!=' ')
			{
				c++;
			}
			
		}
		 System.out.println(c);
		 
	}
}
