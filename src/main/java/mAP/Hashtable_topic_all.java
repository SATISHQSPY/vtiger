package mAP;




import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Hashtable_topic_all {
public static void main(String[] args) {
	Hashtable <String,Integer> t = new Hashtable<>();
	t.put("s", 25);
	t.put("s", 85);
	t.put("r", 98);
	t.put("q", 21);
	t.put("w", 45);
	t.put("q", 67);
	t.put("b", 101);
	System.out.println(t);
	
	
	
	Hashtable< String,Integer> t1 = new Hashtable<>();
	//t1.put("a", 1);
	t1.putAll(t);
	System.out.println(t1);

	
	System.out.println("print keys");
	Set<String> ks = t1.keySet();
	for (String kset:ks)
	{
	System.out.println(kset);
	
	  }
	System.out.println("print values");
Collection<Integer> list = t1.values();
 Iterator i = list.iterator();
 while (i.hasNext())
 {
	System.out.println(i.next());
	
}
  Enumeration<String> entry = t1.keys();
 
}
}
