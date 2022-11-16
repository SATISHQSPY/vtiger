package newPACKAGE;

public class ReplaceString {
	public static void main(String[] args) {
		
	
	String s = "testyantra";
	String s1="   testyantra"  ;
	String s2="36dgj79sgb147dg";
	System.out.println(s1.replace('a', 'e'));
System.out.println(s1.replace("ty", "n"));
//System.out.println(s1.replace("[AEIOU]", "O"));
System.out.println(s2.replaceAll("[123456789]", "Z"));
	}
}