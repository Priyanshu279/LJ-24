import java.lang.*;
import java.util.*;

class LJ24P10AreaofTriangle
{
	public static void main(String [] args)
	{
	
		float base,height,area;
		System.out.println("Enter base and height ");
		Scanner sc = new Scanner(System.in);

		base = sc.nextInt();
		height = sc.nextInt();

		area = (base*height)/2;

		System.out.println("area of a triangle is "+area);
	}
}