package newPACKAGE;

public class Stringbufferconcept {
public static void main(String[] args) {
	StringBuffer s = new StringBuffer ("testyantra");
	StringBuffer s1 = new StringBuffer ("Testyantra");
	System.out.println(s.equals(s1));//refer to object addresss
	System.out.println(s==s1);// compare the reference
	System.out.println(s.append(s1));//concate and store in 's' which is permanent
	System.out.println(s);//
	System.out.println(s1);
System.out.println(s.compareTo(s1));//-10 means compared with append result ; 0 mens compared with each 's' and 's1'
}
}
