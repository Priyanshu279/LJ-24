import java.lang.*;
import java.util.*;

class LJ24P19StringMethods
{
	public static void main(String [] args)
	{
		//Length()
		String str=new String("netbeans");
		int len=str.length();
		System.out.println(len);

		//UpperCase()/LowerCase()
		String str2=str.toUpperCase();
		System.out.println(str);
		System.out.println(str2);

		String str3="JaVa";
		str3=str3.toLowerCase();
		System.out.println(str3);
		
		//Trim()
		String str4="   Welcome   ";
		System.out.println(str4);
		str4=str4.trim();
		System.out.println(str4);
		
		//Substring()
		String str5="Learning";
		System.out.println(str5.substring(1));
		System.out.println(str5.substring(1,5));

		//Replace()
		String str6="Banana";
		String str7=str6.replace('a','l');
		System.out.println(str6+" "+str7);

		//StartsWith()/EndsWith()
		String str8="Mr. Priyanshu Suryavanshi";
		System.out.println(str8.startsWith("Mr."));
		System.out.println(str8.startsWith("Pri",4));
		System.out.println(str8.endsWith("shi"));
		
		//CharAt()
		String str9="Programming";
		System.out.println(str9.charAt(3));
		
		//IndexOf()
		String str10="Banana";
		System.out.println(str10.indexOf('a'));
		System.out.println(str10.lastIndexOf('n'));

		//Equals()/EqualsIgnoreCase()/==/CompareTo()
		String str11="pyramid";
		String str12=new String("Pyramid");
		System.out.println(str11.equals(str12));
		System.out.println(str11.equalsIgnoreCase(str12));
		System.out.println(str11==str12);
		System.out.println(str11.compareTo(str12));

		//Contains()
		String str13="The statue of unity";
		System.out.println(str13.contains("unity"));

		//Concat()
		String str14="the great wall";
		String str15=" of china";
		System.out.println(str14.concat(str15));
		System.out.println(str14+str15);

	}
}