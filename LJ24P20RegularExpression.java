import java.lang.*;
import java.util.*;

class LJ24P20RegularExpression
{
	public static void main(String [] args)
	{
		String str1="m";
		System.out.println(str1.matches("."));

		String str2="c";
		System.out.println(str2.matches("[abcd]"));
		
		String str3="k";
		System.out.println(str3.matches("[^abc]"));
		
		String str4="p9";
		System.out.println(str4.matches("[a-z][0-9]"));
		
		String str5="a";
		System.out.println(str5.matches("a|b"));
		
		String str6="abc";
		System.out.println(str6.matches("abc"));
		
		String str7="h";
		System.out.println(str7.matches("\\w"));
		
		String str8="5";
		System.out.println(str8.matches("\\d"));
		
		String str9=" ";
		System.out.println(str9.matches("\\s"));

		String str10="%";
		System.out.println(str10.matches("\\W"));
		
		String str11="J";
		System.out.println(str11.matches("\\D"));
		
		String str12="9";
		System.out.println(str12.matches("\\S"));

		String str13="abc def";
		System.out.println(str13.matches(".*"));
		
		String str14="abcdddef";
		System.out.println(str14.matches("[a-z]*"));

		String str15="aabbbcbac";
		System.out.println(str15.matches("[abc]+"));
		
		String str16="acc";
		System.out.println(str16.matches("[abc]{3}"));

		String str17="accba";
		System.out.println(str17.matches("[abc]{3,7}"));
		
		String str18="john@gmail.com";
		System.out.println(str18.matches("\\w*@gmail(.*)"));

	}
}