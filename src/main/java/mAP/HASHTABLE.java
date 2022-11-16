package mAP;

import java.util.Hashtable;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class HASHTABLE {
public static void main(String[] args) {
	Hashtable t = new Hashtable();
	t.put("s", 25);//duplicate key not allowed here key is string format hence index 0 is accepted with index 1
	t.put('s', 25);
	t.put(2.0, "tyss");
	t.put(2, 100);
	t.put(2, 'y');
//	t.put(null,null);//null values not allowed
	//t.put(2,null);
System.out.println(t);
System.out.println(t);
System.out.println(t);
System.out.println(t);
System.out.println(t);
}
}
