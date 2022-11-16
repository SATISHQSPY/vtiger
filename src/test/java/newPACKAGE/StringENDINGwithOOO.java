package newPACKAGE;

public class StringENDINGwithOOO {
public static void main(String[] args) {
	String s ="Hello who are you";
	String[] str = s.split(" ");
	for (int i=0;i<str.length;i++)
	{
		String str1 = str[i]; 
		if (str1.charAt(str1.length()-1)=='0') {
			System.out.println(str1+"is having 0 in end");
		}
		
	}
}
}
