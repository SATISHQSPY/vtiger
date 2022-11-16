package vECTOR;

import java.util.Stack;

public class STACKflow {
public static void main(String[] args) {
	Stack s = new Stack();
	s.add('s');
	s.push('a');
	s.add('t');
	s.push('i');
	s.add('s');
	s.push('h');
	System.out.println(s);

	System.out.println(s.pop());

	System.out.println(s.peek());
}
}
