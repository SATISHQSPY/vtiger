package mAP;

import java.util.TreeMap;

public class TREEMAP {
public static void main(String[] args) {
	TreeMap<Integer,String > t = new TreeMap<>();
	t.put(24,"w");
	t.put(1,"q" );
	t.put(6,"r");
	t.put(4,"e");
	t.put(34,"25");
	t.put(6,"s");
	t.put(8,"dr ");
	System.out.println(t);
	System.err.println(t.firstKey());
	System.out.println(t.lastKey());
	System.out.println(t.firstEntry());
	System.out.println(t.lastEntry());
	System.out.println(t.headMap(24));//top of the tree
	System.out.println(t.tailMap(6));
	System.out.println(t.descendingKeySet());
	System.out.println(t.descendingMap());
	
}
}
