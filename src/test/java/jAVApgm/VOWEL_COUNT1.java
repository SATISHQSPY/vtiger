package jAVApgm;

public class VOWEL_COUNT1 {
	public static void main(String[] args) {

		String[] s = { "testyantra", "hyderabad", "bengaluru" };
		
			for (int i = 0; i < s.length; i++) {
				String str = s[i];
				int vowelCount = 0;
				for (int j = 0; j < str.length(); j++) {
					char chj = str.charAt(j);
					if (chj == 'a' || chj == 'e' || chj == 'i' || chj == 'o' || chj == 'u') {
						vowelCount++;
					}
					System.out.println(str+ +vowelCount);
				}
			}
		}
	}
