package tREEset;

import java.util.TreeSet;

public class First_Last_object_POLL {
	public static void main(String[] args) {
		TreeSet l = new TreeSet();
		l.add(89);
		l.add(34);
		l.add(10);
		l.add(2);
		l.add(6);
		l.add(5);
		System.out.println(l);
		System.out.println(l.first());
		System.out.println(l.last());
		System.out.println(l);
		System.out.println(l.pollFirst());//delete first
		System.out.println(l.pollLast());
		System.out.println(l);
	}
}
