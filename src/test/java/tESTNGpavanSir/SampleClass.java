package tESTNGpavanSir;

import org.testng.annotations.Test;

import Genericutility.BaseClass_Test;


public class SampleClass extends BaseClass_Test{
	@Test(groups ="smoke" )
	public void a() {
		System.out.println("97");
	}
@Test
	public void A() {
		System.out.println("65");
	}
}
