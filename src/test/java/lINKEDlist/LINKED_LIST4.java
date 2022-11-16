package lINKEDlist;

import java.util.LinkedList;

public class LINKED_LIST4 {
	public static void main(String[] args) {

		LinkedList a = new LinkedList();
		a.add(1);
		a.add(23);
		a.add(56);
		a.add(3);
		a.add(35);
		System.out.println(a.getFirst());//result fist object
		System.out.println(a.getLast());//result last object
		a.addFirst('s');//result first addition
		a.addLast('r');//result last addition
		System.out.println(a);

	}
}