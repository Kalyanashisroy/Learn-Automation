package com.TestNGListeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



public class MyFristTestCaseClassSuite {

	@Test
	public void GoogleTitleVerify() {
		//System.setProperty("webdriver.gecko.driver", "D:\\Browser\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Browser\\chromedriver_win32_81\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	@Test
	public void TitleMatch() {
		System.out.println("Test dummy");
		Assert.assertTrue(false);
	}
}
