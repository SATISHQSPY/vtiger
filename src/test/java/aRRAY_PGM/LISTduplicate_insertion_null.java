package aRRAY_PGM;

import java.util.ArrayList;

public class LISTduplicate_insertion_null {
public static void main(String[] args) {
	
/*add int index object
ArrayList a = new ArrayList();
System.out.println(a.isEmpty());
a.add('y');
a.add(12);
a.add("12.0");
a.add("sdet-9");
System.out.println(a);
*/

 
 ArrayList a = new ArrayList();
System.out.println(a.isEmpty());
a.add('y');
a.add(12);
a.add("12.0");
a.add("sdet-9");
System.out.println(a);
ArrayList a1 = new ArrayList();
a1.add("sdet-9");
a1.add('s');
a1.add("12.0");
a1.add(12);
a1.add("sdet-9");
a1.add(3,a);
System.out.println(a1);
//addall int index by object

}


}
