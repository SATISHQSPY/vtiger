package aRRAY_PGM;

import java.util.*;
import java.util.ArrayList;
public class ArrayListREVERSE_FORLOOP {

	public static void main(String[] args) {



		ArrayList a1 = new ArrayList();
		a1.add("12");
		a1.add("12.0");
		a1.add("sdet-9");
		a1.add('s');
		a1.add('y');
		a1.add("sdet-9");
	System.out.println(a1);
	for (int i=a1.size()-1;i>=0;i--)
	{
		System.out.println(a1.get(i));
	}



	}
}
