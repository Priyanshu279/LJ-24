import java.lang.*;
import java.util.*;

class LJ24P16BitMagic
{
	public static void main(String [] args)
	{
		int a=9,b=12;
		System.out.println("Before swap: "+"a="+a+" "+"b="+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swap: "+"a="+a+" "+"b="+b);
		
		//Storing x and y both variables in single variable z
		byte x=10,y=15;
		byte z;
		z=(byte)(x<<4);
		z=(byte)(z|y);
		System.out.println((z&0b11110000)>>4); //last 4 bits from right
		System.out.println((z&0b00001111)); //first 4 bits from left
	}
}