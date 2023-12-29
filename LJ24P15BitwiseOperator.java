import java.lang.*;
import java.util.*;

class LJ24P15BitwiseOperator
{
	public static void main(String [] args)
	{
		int x=10,y=6,z;
		z=x&y;
		int z1=x|y;
		int z2=x^y;
		int z3=x<<1;
		int z4=x>>1;
		int z5=~x;

		System.out.println(z);
		System.out.println(z1);
		System.out.println(z2);
		System.out.println(z3);
		System.out.println(z4);
		System.out.println(z5);
	}
}