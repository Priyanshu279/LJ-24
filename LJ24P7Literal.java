import java.lang.*;

class LJ24P7Literal
{
	public static void main(String [] args)
	{
		byte b1 = 10;
		byte b2 = 0b1010;
		byte b3 = 012;
		byte b4 = 0XA;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);

		long l = 999_999_999;
		System.out.println(l);

		float f = 123_456.56f;
		System.out.println(f);
	}
}