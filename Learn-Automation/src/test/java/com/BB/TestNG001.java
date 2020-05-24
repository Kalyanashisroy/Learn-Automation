package com.BB;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestNG001 {
	WebDriver driver;
	@Test
	public void verifyTestNG() {
		Test1234 ts=new Test1234();
		ts.run123(driver);
	}
	
}
