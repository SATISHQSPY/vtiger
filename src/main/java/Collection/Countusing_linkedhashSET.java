package Collection;

import java.util.LinkedHashSet;

public class Countusing_linkedhashSET {


public static void main(String[] args) {

		String s= "indiaa";
		
		LinkedHashSet <Character>ls = new LinkedHashSet<>();
		for (int i=0;i<s.length();i++)
		{
			ls.add(s.charAt(i));
		}
		System.out.println(ls);
	for (Character lset:ls)
	{
		int Count=0;
	for (int i=0;i<s.length();i++)
		
		{
		if (lset.equals(s.charAt(i)))
		{
			Count++;
			
		}
		
		}
	System.out.println(lset+" "+Count);

	}

	
	}


}

