package jAVApgm;

public class UNIVERSALSHIFTING {

	public static void main(String[] args) {
		String s = "a*#b8%d#z";//Z*#D8%B#A
		char[] ch = s.toCharArray();
		int left = 0;
		int right = ch.length-1;//right=8
		for (int i=0;i>ch.length;i++) {
			if (ch[left]>='a'  && ch[left]<='z')
			{
				if (ch[right]>='a' && ch[right]<='z')
				{
					if (left<right)
					{
						char temp =ch[left];
						ch[left]=ch[right];
						ch[right]=ch[temp];
						left++;
						right--;
					}
				}
				else
				{
					right--;
				}
			}
			else
			{
				left++;
			}

		}
		System.out.println(ch);

	}
}



