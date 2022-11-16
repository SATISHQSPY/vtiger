package newPACKAGE;

public class SwappingOCCURANCE {
	public static void main(String[] args) {
		String s = "welcome to hyderabad TYSS";
		String temp= " ";
		String[] s3 = s.split(" ");
	temp = s3[0];
	s3[0]=s3[s3.length-1];
		 s3[s3.length - 1]=s3[0];

		for (int i = 0; i < s3.length; i++) {
			System.out.print(s3[i] + " ");
		}
	}
}
