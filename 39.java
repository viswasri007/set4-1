import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int total=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int max;
		while(count<10)
		{
			total=total+n;
			count++;
		}
		max=total;
		System.out.println(max);	}
}
