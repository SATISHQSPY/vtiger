package aRRAY_PGM;

import java.util.*;

public class ISEMPTY_ {
	public static void main(String[] args) {

		ArrayListREVERSE_FORLOOP a = new ArrayListREVERSE_FORLOOP();
		System.out.println(a.isEmpty());// true
		a.add("sdet-9");
		a.add(12);
		a.add('y');
		System.out.println(a);
		ArrayListREVERSE_FORLOOP a1  = new ArrayListREVERSE_FORLOOP();
		//a1.add(a);
		System.out.println(a1);// print within collection of collection[[sdet-9,12,y]]
		System.out.println(a);// print only collection as refered as a[sdet-9,12,y]
		//a1.addAll(a);
		System.out.println(a);
		System.out.println(a1);// adding a1 with a[[sdet-9,12,y],sdet-9,12,y]
		a1.add(96);
		a1.add(12);
		a1.add('s');
		a1.add('y');
		System.out.println(a1);// [[sdet-9, 12, y], sdet-9, 12, y, 96, 12.0, s]
		System.out.println(a);// [sdet-9, 12, y]
		System.out.println(a1.size());// 7 adding size with single collection
////a1.remove(96);//we can't give integer as a object
	
		
		a1.remove(0);// we should give as a index
		System.out.println(a1);// [sdet-9, 12, y, 96, 12.0, s] removed index 0 i.e [sdet-9, 12, y]
		System.out.println(a1.contains(96));//true if present or false boolean format should give in print statement
		
		
		a.removeAll(a1);//common object removed from a and a1 i.e 12
		System.out.println(a1);//removed a common array 
		System.out.println(a);//remove of common array doesn't effect
		
		a1.removeAll(a);
		System.out.println(a);
		System.out.println(a1);
		a1.retainAll(a1);//deleted wil be retained
		System.out.println(a1);
	
		ArrayListREVERSE_FORLOOP list = new ArrayListREVERSE_FORLOOP();
		a.add(12);
		a.add('y');
		a.add(12.0);
		System.out.println(a);
ArrayListREVERSE_FORLOOP list1 = new ArrayListREVERSE_FORLOOP();
a1.add('y');
a1.add(12);
a1.add(96);
a1.add(12.0);
System.out.println(a1);
System.out.println(a.containsAll(list1));//checks the list1 data is present in a and return booleanformat as true


//note:clearall in collection
//removeall remove common objects 
	}
}