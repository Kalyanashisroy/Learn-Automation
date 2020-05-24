package com.DDT.wordpress;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Utility.ExcelDataConfig;

public class WordpressLoginExcel {
	WebDriver driver;
	
	@Test(dataProvider="wordpressData")
	public void loginToWordpress(String username,String password) throws InterruptedException {
		try {
		System.setProperty("webdriver.chrome.driver", "D:\\Browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
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
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@DataProvider(name="wordpressData")
	public Object[][] passdata(){
		ExcelDataConfig config=new ExcelDataConfig("C:\\Users\\KALYANASHIS\\eclipse-workspace\\Learn-Automation\\TestData\\DataExcel.xlsx");
		
		int rows=config.getRowCount(5);
		Object[][] data=new Object[rows][2];
		for(int i=0;i<rows;i++) {
			data[i][0]=config.getData(5, i, 0);
			data[i][1]=config.getData(5, i, 1);
		}
		return data;
		
		
	}
	

}
