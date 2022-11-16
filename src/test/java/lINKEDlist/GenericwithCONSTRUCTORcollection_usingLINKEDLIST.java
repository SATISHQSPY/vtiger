package lINKEDlist;

import java.util.LinkedList;

public class GenericwithCONSTRUCTORcollection_usingLINKEDLIST {
public static void main(String[] args) {
	LinkedList <Integer> a = new LinkedList<>();
	a.add(2);
	a.add(3);
	a.add(45);
	a.add(65);
	a.add(20);
	a.add(9);
	LinkedList l = new LinkedList<>(a);
	a.add(7);
	System.out.println(a);
	System.out.println(l);
	LinkedList l1 = new LinkedList<>(a);
	
	l.add(10);
	l1.add(2);
	System.out.println(a);
	System.out.println(l);
	System.out.println(l1);
	}
}
