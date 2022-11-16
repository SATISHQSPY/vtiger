package Collection;

import java.util.LinkedHashSet;

public class Abcddcbabacdbcad {

	public static void main(String[] args) {
	  String s ="abcdabcdabcdabcd";
	  // this is to remove duplicate
	  LinkedHashSet <Character>lh = new LinkedHashSet();
	  for ( int i=0;i<s.length();i++)
	  {
		  lh.add(s.charAt(i));
	  }
	System.out.println(lh);
	//this is to compare collection with string
	for ( Character lset:lh)
	{
		for (int i=0;i<s.length();i++)
		{
			if (lset.equals(s.charAt(i)))
			{
			System.out.print(s.charAt(i));
		
	}
	}
	System.out.println();
	}
	
	}
}
