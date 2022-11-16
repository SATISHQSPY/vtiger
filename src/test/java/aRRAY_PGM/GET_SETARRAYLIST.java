package aRRAY_PGM;

import java.util.ArrayList;

public class GET_SETARRAYLIST {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		System.out.println(a.isEmpty());
		a.add("12");
		a.add("12.0");
		a.add("sdet-9");
		a.add('s');
		a.add('y');
		a.add("sdet-9");
		System.out.println(a);
		System.out.println(a.get(2));//get a data
		a.set(1, "tyss");//set a data
		System.out.println(a);
}
}
