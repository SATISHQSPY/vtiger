package newPACKAGE;

public class LargestSTRING {
	
	public static void main(String[] args) {
		
		String s = "I AM THE AUTOMATION ENGINEER";
String[] sp = s.split(" ");
System.out.println(sp.length);

		for (int i = 0; i < sp.length;i++)
		{
System.out.println(sp[i]+" "+sp[i].length());
		}
		
		int maxCount=0;
		String word=" ";
		for (int i=0;i<sp.length;i++)
		{
			if (sp[i].length()>maxCount)
			{
				maxCount=sp[i].length();
				word=sp[i];
			}
		}
		System.out.println(word+" "+maxCount);
	}
	
		}
