import java.lang.*;
import java.util.*;

class LJ24P11AreaofTriangle1
{	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		double s,area;
		
		System.out.println("Enter 3 sides of a triangle ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();

		s=(a+b+c)/2;	
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("area of a triangle is "+area);
	}
}
	