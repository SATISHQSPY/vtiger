package mAP;
import java.util.LinkedHashMap;
import java.util.Set;
public class LinkedHashmap {
	public static void main(String[] args) {
		
	
LinkedHashMap <String,Integer> l = new LinkedHashMap<>();
l.put("s", 25);
l.put("s", 85);
l.put("r", 98);
l.put("q", 21);
l.put("w", 45);
l.put("q", 67);
l.put("b", 101);
l.put(null, null);
System.out.println(l);
 

System.out.println("print keys");
Set<String> ks = l.keySet();
for (String kset:ks)
{
System.out.println(kset);

  }
}
}