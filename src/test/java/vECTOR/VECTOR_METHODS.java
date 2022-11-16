package vECTOR;

import java.util.Vector;

public class VECTOR_METHODS {
	public static void main(String[] args) {
		
	
	Vector v = new Vector();
	v.addElement("static");
	v.add("block");
	v.add(1, "non static");
	v.add("constructor");
	v.add("non static block");
	System.out.println(v);
	System.out.println(v.get(1));
	System.out.println(v.elementAt(0));
	System.out.println(v.firstElement());
	System.out.println(v.lastElement());
	}
}
