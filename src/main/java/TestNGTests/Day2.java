package TestNGTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	@Test(groups= {"Smoke"})
	public void Ploan() {
		System.out.println("good");
	}
    @BeforeTest
    public void Prerequiste() {
    	System.out.println("I will execute first");
    }
}
