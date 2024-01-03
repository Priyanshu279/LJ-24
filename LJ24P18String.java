import java.lang.*;
import java.util.*;

class LJ24P18String
{
	public static void main(String [] args)
	{
		String str1="Java Program";
		String str2=new String("JAVA");
		char c[]={'H','e','l','l','o'};
		String str3=new String(c);
		byte b[]={65,66,67,68};
		String str4=new String(b);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

		String strr1="Java";
		String strr2="Java";
		String strr3=new String("Java");
		System.out.println(strr1==strr2);
		System.out.println(strr1==strr3);
	}
}