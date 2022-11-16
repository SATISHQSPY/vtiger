package Collection;

import java.util.LinkedHashSet;

public class VowelCOUNT_INDIA {

	
public static void main(String[] args) {
	String s= "india";
	int vowelCount = 0;
	LinkedHashSet <Character>ls = new LinkedHashSet<>();
	for (int i=0;i<s.length();i++)
	{
		ls.add(s.charAt(i));
	}
	System.out.println(ls);
for (Character lset:ls)
{
	if (lset=='a'||lset=='e'||lset=='i'||lset=='o'||lset=='u')
	{
		vowelCount++;
	}
}

System.out.println(s+" "+vowelCount);

}
}
