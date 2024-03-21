package CoreJavaPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {

	@BeforeMethod
	public void beforerun() {
		System.out.println("Executing before method");
	}

	public void doThis() {
		System.out.println("Executing do this method");

	}
	
	@AfterMethod
	public void afterrun() {
		System.out.println("Executing after method");
	}

}
