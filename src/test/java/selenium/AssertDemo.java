package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	@Test
	public void print() {
		String actual="Sofi";
		String expected="Sarmas";
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		System.out.println("Hello");
//		sa.assertAll();
	}
	
	@Test
	public void wish() {
		String name1="Munna";
		String name2="SUFIYA";
		
		
		Assert.assertEquals(name1, name2);
		System.out.println("Hello2");

	}	
}