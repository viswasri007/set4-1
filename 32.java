import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		int count = 1;
 
		for (int i = 0; i < input.length() - 1; i++)
		{
			if ((input.charAt(i) == ' ') && (input.charAt(i + 1) != ' '))
			{
				count++;
 
			}
		}
 		System.out.println(count);
	}
}
