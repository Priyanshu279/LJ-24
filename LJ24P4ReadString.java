import java.lang.*;
import java.util.*;

class LJ24P4ReadString
{
	public static void main(String [] args)
	{
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("May I Know your name? ");
		name = sc.nextLine();
		System.out.println("Welcome "+name);
	}
}