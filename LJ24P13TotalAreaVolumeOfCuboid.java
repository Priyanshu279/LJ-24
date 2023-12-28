import java.lang.*;
import java.util.*;

class LJ24P13TotalAreaVolumeOfCuboid
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int length,breadth,height,totalArea,volume;

		System.out.println("Enter length breadth and height ");
		length=sc.nextInt();
		breadth=sc.nextInt();
		height=sc.nextInt();
		
		totalArea=2*(length*height+breadth*height+breadth*length);
		volume=length*breadth*height;

		System.out.println("Total Area of a Cuboid is "+totalArea);
		System.out.println("Volume of a Cuboid is "+volume);
	}
}		