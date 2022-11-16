package newPACKAGE;

public class EqualsIgnoreCase {
public static void main(String[] args) {
	String s = "testyantra";
	String s2="testyantra12";
	String s4="TESTyantra12";
	String s5="testyantra12";
	String s3 = "beng aluru";
	System.out.println(s2.equalsIgnoreCase(s));//INDEX VALUE NOT MATCHES
	System.out.println(s3.equalsIgnoreCase(s));
	System.out.println(s2.equalsIgnoreCase(s4));//BECAUSE INDEX VALUE MATCHES AND IGNORE THE CASES
	System.out.println(s2.contentEquals(s4));//IT COUNT BOTH CONTENT AS WELL AS IGNORE CASES IN THIS CASE
	System.out.println(s2.contentEquals(s5));
}
}
