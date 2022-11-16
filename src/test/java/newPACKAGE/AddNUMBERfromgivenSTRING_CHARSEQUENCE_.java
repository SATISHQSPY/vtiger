package newPACKAGE;

public class AddNUMBERfromgivenSTRING_CHARSEQUENCE_ {
	public static void main(String[] args) {

		String s = "a11b22c33";
		int sum = 0;
		int temp = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char charr = s.charAt(i);
			
			if (charr >= '0' && charr <= '9') {
				int num = charr - 48;
				temp = temp * 10 + num;
			}
			
			else {
				sum = sum + temp;
				temp = 0;
				}
			
			
		}
		System.out.println(sum + temp);
	}
}
