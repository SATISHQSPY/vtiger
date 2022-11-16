package tREEset;

import java.util.TreeSet;

public class All_CharectersticinONE_PGM {
public static void main(String[] args) {
	TreeSet l = new TreeSet();
	l.add(25);
	l.add(6);
	l.add(89);
	l.add(15);
	l.add(32);
	l.add(32);     //it won't allow null value 
	l.add(2);
	//l.add(null);   //it wont allow null value element
	//l.add("sdet");  //ir wont allow hetrogenous collection object
	System.out.println(l);
	
}
}
