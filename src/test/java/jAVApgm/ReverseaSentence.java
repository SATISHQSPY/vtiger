package jAVApgm;

public class ReverseaSentence {
	public static void main(String[] args) {
//		String s = "djtillu is a movie";
//		String[] s1 = s.split(" ");
//		String rev = "";
//
//		for (int i = 0; i < s1.length; i++) {
//			rev = s1[i] + " " + rev;
//		}
//		System.out.println(rev);
//
//	}
//}
		String s = "djtillu is a movie";
		String[] str = s.split(" ");
		for (int i=0;i<str.length;i++) {
			
		String str1 = str[i];
		String rev = "";

		for (int j= 0; j< str1.length(); j++) {
	
			
			rev = str1.charAt(j)+rev;
			
		}
		System.out.println(rev+" ");

	}
}
}
