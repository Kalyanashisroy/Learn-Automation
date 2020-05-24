package com.BB;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RunTest {
	WebDriver driver;
	@Test
	public void verifyJFPP() throws InterruptedException {
		JFPP jfpp=new JFPP();
		System.setProperty("webdriver.chrome.driver", "D:\\Browser\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///D:/JavaFirstParentPage.html");
		Thread.sleep(3000);
		jfpp.EnterCSSValue1_2(driver, "ABC");
						
		Thread.sleep(3000);
		jfpp.EnterCSSValue1_3(driver, "AAA", "BBB", "CCC");
		Thread.sleep(3000);
		jfpp.EnterCSSValue1_4(driver, "AAA1", "BBB1", "CCC1", "DDD1", "EEE1");
		Thread.sleep(3000);
		jfpp.PrintText(driver);
		driver.quit();
		
	}

}
