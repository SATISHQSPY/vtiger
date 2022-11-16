package jAVApgm;

public class Word_ENDINGwith_O {
	public static void main(String[] args) {
		
	
String s = "hello who are you";
String[] str = s.split(" ");
for (int i=0;i<str.length;i++)
{
	String str1 = str[i];
	boolean con = str1.contains("o");
if (con==true);
{
	System.out.println(str1);
}
}
}
}
