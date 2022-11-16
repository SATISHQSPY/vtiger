package newPACKAGE;

public class RemovingDuplicateSTRING {
	public static void main(String[] args) {
		String s = "aaaabbbccda";
		char[] ch = s.toCharArray();
		String s1=" ";
			for (int i=0;i<ch.length;i++)
			{
	if (s1.indexOf(ch[i])==-1) {
				s1=s1+ch[i];
	}
			}
			System.out.println(s1);
			}
				
		}
	


