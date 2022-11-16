package aRRAY_PGM;

import java.util.ArrayList;

public class INDEXOFarray {
public static void main(String[] args) {
	ArrayList a = new ArrayList();
	System.out.println(a.isEmpty());
	a.add(12);
	a.add("12.0");
	a.add("sdet-9");
	a.add('s');
	a.add('s');
	a.add("sdet-9");
	System.out.println(a);
	System.out.println(a.lastIndexOf("sdet-9"));
	System.out.println(a.indexOf("sdet-9"));
}
}
