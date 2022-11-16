package aRRAY_PGM;

import java.util.ArrayList;
import java.util.ListIterator;

public class LISTIterator_hasnext {
	public static void main(String[] args) {
		
	
ArrayList list = new ArrayList();
list.add("5");
list.add("sdet-9");
list.add("12");
list.add("12.0");
System.out.println(list);
ListIterator i = list.listIterator();
while (i.hasNext()) {
	System.out.println(i.next());
}
System.out.println("reverse order");
while (i.hasPrevious());
System.out.println(i.previous());

	}
}
