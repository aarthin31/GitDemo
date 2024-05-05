package basics;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo2 {
	
	@Test(dependsOnMethods = {"ruralDepartmentUser","ruralLocalBody"})
	public void ruralCitizenLogin(){
		System.out.println("agoram");
	}
	
	@BeforeSuite
	public void bfSuite() {
		System.out.println("suite: BEFORE SUITE WILL EXECUTE AT THE BEGINING OF THE SUITE");
	}
	
	@AfterSuite
	public void afSuite(){
		System.out.println("suite: AFTER SUITE WILL EXECUTE AT THE END OF THE SUITE");
	}
	
	@Parameters({"url"})
	@Test(groups=("testGroup1"))
	public void ruralDepartmentUser(String link){
		System.out.println("Nallambakkam");
		System.out.println(link);
	}
	
	@Test
	public void ruralLocalBody(){
		System.out.println("Village Panchayat President");
	}
	
	
}
