package vECTOR;

import java.util.Vector;

public class VECTOR_remainingMETHOD {
public static void main(String[] args) {
	Vector v = new Vector();
	v.addElement("static");
	v.add("block");
	v.add(1, "non static");
	v.add("constructor");
	v.add("non static block");
	System.out.println(v);
	v.removeElement("static");
	System.out.println(v.removeAll(v));
	System.out.println(v);
}
}
