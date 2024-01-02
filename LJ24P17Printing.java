import java.lang.*;
import java.util.*;

class LJ24P17Printing
{
	public static void main(String [] args)
	{
		int x=-10,y=20;
		float b=1552.5578775f;
		char c='A';
		String str="Java";
		System.out.println(x+y);
		System.out.println("Number of x is "+x);
		System.out.println(x+y+" Sum");
		System.out.println("Sum "+(x+y));
		System.out.println("Sum of "+x+" and "+y+" is "+(x+y));
		System.out.printf("Hello %x %f %c World %s \n",x,b,c,str);
		System.out.printf("%3$s %2$f %1$d \n",x,b,str);
		System.out.printf("%(5d \n",x);
		System.out.printf("%6.2f",b);
	}
}