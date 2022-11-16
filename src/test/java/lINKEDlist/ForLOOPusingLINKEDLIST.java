package lINKEDlist;

import java.util.LinkedList;

public class ForLOOPusingLINKEDLIST {
	public static void main(String[] args) {

		LinkedList l = new LinkedList();

		l.add(1);
		l.add(23);
		l.add(56);
		l.add(3);
		l.add(35);
		System.out.println(l);
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l);
		}

//		System.out.println(l.getFirst());// result fist object
//		System.out.println(l.getLast());// result last object
//		l.addFirst('s');// result first addition
//		l.addLast('r');// result last addition
//		System.out.println(l);

	}

}
