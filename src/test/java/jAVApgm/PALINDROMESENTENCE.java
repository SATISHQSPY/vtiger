package jAVApgm;

public class PALINDROMESENTENCE {
	public static void main(String[] args) {
		String s = "madam";
		char[] ch =s.toCharArray();
		String rev = "";
		for (int i=0;i<ch.length;i++)
		{
			rev = ch[i]+rev;

		}
		if (s.equals(rev))
		{
			System.out.println(s+" "+" is a palindrome");
		}	
		else
		{
			System.out.println(s+ " "+ "not a palindrome");
		}
	}
}

