package Demo;

public class voweljava {
public static void main(String[] args) {
	String str="sravankumar";
	String s="",s1="";
	for (int i=0;i<str.length();i++)
	{
		char ch = str.charAt(i);
		
		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			s=s+ch;
			
		}
		else
		{
			s1=s1+ch;
			
		}
		
	}
	System.out.print("vowels present in "+str+" are" );
	System.out.println(s);
	System.out.print("consonants present in "+str+" are ");
	System.out.println(s1);


}

}
