package jAVApgm;

public class Reverse_String {
	public static void main(String[] args) {
		
	
//	String s = "DJTILLU";
//String rev = "";
//
//	for (int i=0;i<s.length();i++)
//		
//	{
//		rev = s.charAt(i)+rev;
//	}
//	System.out.println(rev);
//	}
//	}

//WITHOUT USING LENGTH VARIABLE

//String s = "DJTILLU";
//char[] charr = s.toCharArray();
//int count=0;
//for (char ch:charr)
//{
//	count++;
//}
//	
//System.out.println(count);
//for(int i=count-1;i>=0;i--)
//{
//	System.out.println(s.charAt(i));
//}
//}
//}


//WITHOUT COUNT USING TEMP
		String s = "DJTILLU";
		char[] charr = s.toCharArray();
		int count=0;
		String rev="";
		for (char ch:charr)
		{
			count++;
		}
			
		System.out.println(count);
		for(int i=count-1;i>=0;i--)
		{
			rev=rev+charr[i];		
		}
			System.out.println(rev);
		}
}

		//}










