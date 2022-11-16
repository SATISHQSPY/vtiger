package Collection;

import java.util.LinkedHashSet;

public class nonDUPLICATE_katham {
public static void main(String[] args) {
	String s = "khtam ta ta bye bye";
	String[] str = s.split(" ");
	LinkedHashSet <String> lh = new LinkedHashSet<>();
for (int i=0;i<str.length;i++)
{
	lh.add(str[i]);
	
}
System.out.println(lh);
for (String lset:lh)
{
	for(int i=0;i<str.length;i++)
	{
		if (lset.equals(str[i]))
		{
			System.out.println(lset+" "+i);
			break;
		}
			
	}
}
}

}
