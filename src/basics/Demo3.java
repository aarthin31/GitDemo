package basics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo3 {

	@Test
	public void townCitizenLogin(){
		System.out.println("aarthin3");
	}
	
	@Test(groups=("testGroup1"))
	public void townDepartmentUser(){
		System.out.println("Madhurandhakam");
	}
	
	@Test(enabled = false)
	public void townLocalBody(){
		System.out.println("Executive Officer");
	}
	
	@AfterTest
	public void lastExecution() {
		System.out.println("test: EXECUTE AFTER ANY TEST BELONGING TO THAT FOLDER");
	}
	
	@BeforeTest
	public void prerequisite() {
		System.out.println("test: EXECUTE BEFORE ANY TEST BELONGING TO THAT FOLDER");
	}
}
