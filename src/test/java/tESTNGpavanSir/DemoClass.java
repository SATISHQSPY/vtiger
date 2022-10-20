package tESTNGpavanSir;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoClass {
@Test
public void test1() {
	System.out.println("DEMO1");
}

@Test
public void test2() {
	String name1="bharat";
	String name2="satish";
	Assert.assertEquals(name1, name2);
	System.out.println("pavan");
	
}

public void test3() {
	System.out.println("DEMO3");
}

public void test4() {
	System.out.println("DEMO4");
}
}
