import java.lang.*;
import java.util.*;

class LJ24P21StringProblems
{
	public static void main(String [] args)
	{	
		//Problem-1
		String str="programmer@gmail.com";
		System.out.println(str.matches(".*@gmail.*"));

		int i=str.indexOf('@');
		int j=str.indexOf('.');
		String userName = str.substring(0,i);
		String domainName = str.substring(i+1,j);
		System.out.println("Username: "+userName);
		System.out.println("Domain: "+domainName);
		System.out.println(domainName.equals("gmail"));
		
		//Problem-2
		String str1="10110001";
		System.out.println("Binary? "+str1.matches("[01]*"));
		
		String str2="0X124AF";
		System.out.println("Hexadecimal? "+str2.matches("[0][xX][a-fA-F0-9]*"));
		
		String str3="18/01/2024";
		System.out.println("Date format? "+str3.matches("[0-3][0-9][/][01][0-9][/][0-9]{4}"));

		//Problem-3
		String str4="a!b@c#1$2%3";
		System.out.println(str4.replaceAll("[^a-zA-Z0-9]",""));

		String str5="   abc de  fgh    ijk      ";
		str5=str5.replaceAll("\\s+"," ").trim();
		System.out.println(str5);
		String words[]=str5.split("\\s");
		System.out.println(words.length);
	}
}