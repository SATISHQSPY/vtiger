package jAVApgm;

public class VOWEL_COUNT {

	public static void main(String[] args) {
		String[] s = {"SRAVAN","THARUN","RAJU"};
		
		for (int j=0;j<s.length;j++)
		{
			String str1 = s[j];
		int count=0;
		String[] str = str1.split("A");
	for (int i=0;i<s.length;i++)
	{
	char ch = str1.charAt(i);
	if (ch=='a'|| ch=='e'||ch=='o'||ch=='i'||ch=='u') {
			count++;
		System.out.println(ch);
			}	
	
		
	}
	System.out.println("vowels count is"+count);
	}
	
	}


}
