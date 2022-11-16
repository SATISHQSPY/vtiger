package newPACKAGE;

public class TrimANDsubString {
	public static void main(String[] args) {
		
	
	String s = "testyantra";
		String s1="   testyantra12"  ;
		System.out.println(s1);
		System.out.println(s1.trim());//trim the spaces of beginning and last 
		System.out.println(s.substring(1, 6));
		System.out.println(s1.substring(3, 8));//it include with beginning  number and end exclude given index number
	}
}
