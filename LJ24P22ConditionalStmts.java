import java.lang.*;
import java.util.*;

class LJ24P22ConditionalStmts
{
	public static void main(String [] args)
	{
		int a=5,b=15,c=4;
		System.out.println(a<b);
		System.out.println(a<b&&a<c);
		
		//if-else
		int x=5;
		if(x>=0)
		{
			System.out.println("Positive");
		}
		else
		{
			System.out.println("Negative");
		}
		
		//nested if-else
		if(a>b&&a>c)
		{
			System.out.println("a");
		}
		else
		{	
			if(b>c)
			{
				System.out.println("b");
			}
			else
			{
				System.out.println("c");
			}
		}	
	}
}