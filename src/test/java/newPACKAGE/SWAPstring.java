package newPACKAGE;

public class SWAPstring {
public static void main(String[] args) {
	String s ="hyderabad";
	String s2 = "bengaluru";

	s=s+s2;
	s2=s.substring(0, s.length()-s2.length());
s=s.substring(s2.length());
	System.out.println(s+"\n"+s2);
	
}
}
