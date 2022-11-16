package lINKEDlist;

import java.util.LinkedList;

public class LINKEDLIST_by_INDEX {
	public static void main(String[] args) {
		LinkedList <Integer> a = new LinkedList<>();
		a.add(2);
		a.add(3);
		a.add(45);
		a.add(65);
		a.add(20);
		a.add(9);
		a.add(3, 1000);//adding index in linked list
		LinkedList l = new LinkedList<>(a);
		a.add(7);
		System.out.println(a);
		System.out.println(l);
		System.out.println(a.get(3));
}
}
