package lINKEDlist;

import java.util.LinkedList;
//import java.util.ListIterator;

public class AscendingANDdescendingLINKEDLIST {
	public static <ListIterator> void main(String[] args) {
		//LinkedList <Integer> a = new LinkedList<>();
		LinkedList  a = new LinkedList();
		a.add(2);
		a.add(3);
		a.add(45);
		a.add(65);
		a.add(20);
		a.add(9);
	
		
		java.util.ListIterator<Integer> l = a.listIterator();
		while (l.hasNext()) {
			System.out.println(l.next());
		}
System.out.println("printing reverse");
while (l.hasPrevious()) {
	System.out.println(l.previous());
}
	}
}