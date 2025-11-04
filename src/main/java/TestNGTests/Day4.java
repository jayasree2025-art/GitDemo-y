package TestNGTests;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	@Parameters({"URL"})
	@Test
	public void WebloginHomeLoan(String uname) {
		//selenium
		System.out.println("webloginhomePersonalLoan");
		System.out.println(uname);
	}
	@Test(groups= {"Smoke"})
	public void MoblieLoginHomeLoan() {
		//APPIUM
		System.out.println("MoblieLoginHome");
	}
	@Test
	public void LoginAPIHomeLoan() {
		//Rest API automation
		System.out.println("APILoginHome");
	}

}
