package tESTNGpavanSir;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
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
	AssertJUnit.assertEquals(name1, name2);
	System.out.println("pavan");
	
}

@Test
public void test3() {
	System.out.println("DEMO3");
}

@Test
public void test4() {
	System.out.println("DEMO4");
}
}
