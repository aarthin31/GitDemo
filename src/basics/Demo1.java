package basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {

	@Test
	public void test1(){
		System.out.println("test 1");
	}
	
	@Parameters({"username", "password"})
	@Test
	public void test2(String uname, String pwd){
		System.out.println("test 2");
		System.out.println(uname +" & "+ pwd);
	}
	
	@BeforeClass
	public void bfClass() {
		System.out.println("class: BEFORE EXECUTING ALL METHODS IN THE CLASS");
	}
	
	@AfterClass
	public void afClass() {
		System.out.println("class: AFTER EXECUTING ALL METHODS IN THE CLASS");
	}
}
