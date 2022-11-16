package newPACKAGE;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class IndexNumberOf {
public static void main(String[] args) {
	String s = "testyantra";
	String s1="   testyantra12"  ;
	System.out.println(s1.indexOf('y'));
	System.out.println(s1.indexOf(s, 6));//there is no s in next position to check
	
	System.out.println(s1.indexOf('t', 4));//position of index will be printed
	System.out.println(s1.indexOf('t'));
	
	
}
}
