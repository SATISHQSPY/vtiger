package set;

import java.util.HashSet;

public class SetCollection {
public static void main(String[] args) {
	HashSet h = new HashSet();
	h.add(2);
	h.add("null");
	h.add(45);
	h.add(67);
	h.add("null");
	System.out.println(h);
	h.remove(67);
	System.out.println(h);
}


}

