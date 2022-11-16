package tREEset;

import java.util.Iterator;
import java.util.TreeSet;

public class DescendingITERATOR {
public static void main(String[] args) {
	TreeSet l = new TreeSet();
	l.add(89);
	l.add(34);
	l.add(10);
	l.add(2);
	l.add(6);
	l.add(5);
	System.out.println(l);
	
	Iterator i = l.descendingIterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
}
}
