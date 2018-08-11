import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t1=1,t2=1,t3=1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			t1=t2;
			t2=t3;
			t3=t1+t2;
			System.out.println(t1);
		}
	}
}
