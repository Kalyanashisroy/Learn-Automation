package com.DDT.wordpress;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WordpressLogin {
	WebDriver driver;
	@Test(dataProvider="wordpressData")
	public void loginToWordpress(String username,String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Browser\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='wp-submit']")).click();
		Thread.sleep(5000);
		Assert.assertTrue(driver.getTitle().contains("Dashboard"),"User is not able to login- Invalid credentials");
		System.out.println("Page Title verified- User is able to login successfully");
		
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@DataProvider(name="wordpressData")
	public Object[][] passdata(){
		Object[][] data=new Object[3][2];
		data[0][0]="admin";
		data[0][1]="demo";
		
		data[1][0]="admin";
		data[1][1]="demo123";
		
		data[2][0]="admin";
		data[2][1]="demo1234";

		return data;
	}
	

}
