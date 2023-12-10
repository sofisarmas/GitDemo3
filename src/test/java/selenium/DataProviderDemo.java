package selenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	@DataProvider
	public Object[][] getData() {
		Object data[][] = new Object[3][2];
		data[0][0] ="Sofi";
		data[0][1] ="Sarmas";
		data[1][0] ="P";
		data[1][1] ="D";
		data[2][0] ="1";
		data[2][1] ="2";
		return data;		
	}
	
	@Test(dataProvider = "getData")
	public void print(String name, String lName) {
		System.out.println(name+", "+lName);
	}
}
