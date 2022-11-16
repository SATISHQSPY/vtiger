package aRRAY_PGM;

import java.util.ArrayList;

public class GENERIC_TYPE {

	public static void main(String[] args) {
	
		ArrayList<Integer> a = new ArrayList();
a.add(5);
a.add(34);
a.add(12);
a.add(12);
a.add(null);
	System.out.println(a);
	for (Integer i:a)
	{
		System.out.println(i);
	}
	}

}