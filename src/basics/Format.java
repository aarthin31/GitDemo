package basics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Format {

	@Test(groups=("testGroup1"))
	public void Demo(){
		System.out.println("TestNG Tutorial");
		System.out.println("Git6");
		System.out.println("Git7");
		System.out.println("Git8");
		System.out.println("Git9");
		System.out.println("Git");
		System.out.println("Git2");
		System.out.println("Git3");
		System.out.println("Git4");
		System.out.println("Git5");
	}
	
	@Test(dataProvider = "getData")
	public void dpanotation(String uname, String pwd)
	{
		System.out.println("Learning Data Provider Annotation");
		System.out.println(uname);
		System.out.println(pwd);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0] = "first_user";
		data[0][1] = "password";
		
		data[1][0] = "second_user";
		data[1][1] = "password";
		
		data[2][0] = "third_user";
		data[2][1] = "password";
		
		return data;
	}
	
	@BeforeMethod
	public void bfMethod() {
		System.out.println("method: BEFOR EACH AND EVERY METHOD");
	}
	
	@AfterMethod
	public void afMethod() {
		System.out.println("method: AFTER EACH AND EVERY METHOD");
	}
}
