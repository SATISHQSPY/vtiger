package lINKEDlist;

import java.util.LinkedList;

public class GernericOBJECTlinkedlist {
	public static void main(String[] args) {

		LinkedList <Character> a = new LinkedList<>();
		a.add('w');
		a.add('a');
		a.add('f');
		a.add('e');
		a.add('r');
		System.out.println(a.getFirst());//result fist object
		System.out.println(a.getLast());//result last object
		a.addFirst('s');//result first addition
		a.addLast('r');//result last addition
		System.out.println(a);

	}
}

