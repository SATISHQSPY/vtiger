package aRRAY_PGM;

import java.util.ArrayList;

public class FOREACHLOOP {
public static void main(String[] args) {
	ArrayList a1 = new ArrayList();
	a1.add("12");
	a1.add("12.0");
	a1.add("sdet-9");
	a1.add('s');
	a1.add('y');
	a1.add("sdet-9");
System.out.println(a1);
for (Object i:a1)
{
	System.out.println(i);
}
}
}
