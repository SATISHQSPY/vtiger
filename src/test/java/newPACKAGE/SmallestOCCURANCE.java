package newPACKAGE;

public class SmallestOCCURANCE {
	
	public static void main(String[] args) {
		
		String s = "I AM THE AUTOMATION ENGINEER";
String[] sp = s.split(" ");
System.out.println(sp.length);

		for (int i = 0; i < sp.length;i++)
		{
System.out.println(sp[i]+" "+sp[i].length());
		}
		
		int minCount=sp[1].length();
		String word="";
		for (int i=0;i<sp.length;i++)
		{
			if (sp[i].length()<minCount)
			{
				minCount=sp[i].length();
				word=sp[0];
			}
		}
		System.out.println(word+" "+minCount);
	}
	
		}


