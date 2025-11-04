package TestNGTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	@BeforeClass
	public void Beforeclass() {
		System.out.println("before executing any method in the class");
	}
	
	@Parameters({"URL","APIKey/usrname"})
	@Test
	public void WebloginCarLoan(String urlname,String key) {
		//selenium
		System.out.println("web Logincar");
		System.out.println(urlname);
		System.out.println(key);
	}
	@BeforeMethod
	public void BeforeEvery() {
		System.out.println("I Will execute before every test method in day 3 class");
	}
	@AfterMethod
	public void AfterEvery() {
		System.out.println("I Will execute after every test method in day 3 class");
	}
	@BeforeSuite
	public void Bfsuite()
	{
	System.out.println("I am number 1");	
	}
	@Test(groups= {"Smoke"})
	public void MoblieLogincarLoan() {
		//APPIUM
		System.out.println("MoblieLogincar");
		
	}
	@Test(enabled=false)
	public void MoblieSiginincarLoan() {
		//APPIUM
		System.out.println("Moblie Sigin");
	}
	@Test(dataProvider="GetData")
	public void MoblieSignoutcarLoan(String username,String password) {
		//APPIUM
		System.out.println("Moblie Signout");
		System.out.println(username);
		System.out.println(password);
	}
	@Test(dependsOnMethods= {"WebloginCarLoan","MoblieSignoutcarLoan"})
	public void APIcarLoan() {
		//Rest API automation
		System.out.println("API Logincar");
	}
     @DataProvider
     public Object[][] GetData() {
    	//1st combination username password -good credit history 
    	//2nd combination username password -no credit history 
    	//3rd combination username password -fraudelent credit history 
    	 Object[][] data = new Object[3][2];
    	 data[0][0]="firstsetusername";
    	 data[0][1]="firstpassword";
    	 //columns in the row are nothing but values for particular combination(row)
    	 
    	 //2nd set
    	 data[1][0] ="secondsetusername";
    	 data[1][1] ="secondpassword";
    	 
    	 //3rd set
    	 data[2][0]="thirdusername";
    	 data[2][1]="thirdpassword";
    	 return data;
    	 
    	 
    	 
    	 
     }
     
     }

