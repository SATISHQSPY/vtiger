package Collection;

import java.util.LinkedHashSet;

public class TESTERFINAL_NONDUPLICATE {

	public static void main(String[] args) {
		String s = "tester";

		char[] tch = s.toCharArray();
		LinkedHashSet<Character> lh = new LinkedHashSet<>();
		for (int i = 0; i < tch.length; i++) {
			lh.add(tch[i]);
		}
		System.out.println(lh);
		for (Character lset : lh) {
			{
				for (int i = 0; i < tch.length; i++)
					if (lset.equals(tch[i]))

						System.out.println(lset + " " + (i+1));
			break;
			}
		}

	}

	}

