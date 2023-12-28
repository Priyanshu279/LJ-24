import java.lang.*;
import java.util.*;

class LJ24P14IncDec
{
	public static void main(String [] args)
	{
		int x=5,y=4,z;
		z=2*x++ + 3*++y;
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);

		float a=3.5f;
		a++;
		System.out.println("a="+a);

		char b='A';
		b++;
		System.out.println("b="+b);

		byte c=5;
		c++;
		System.out.println(c);
	}
}