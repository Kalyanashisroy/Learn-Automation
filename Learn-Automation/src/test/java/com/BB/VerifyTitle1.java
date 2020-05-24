package com.BB;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle1 {
	
	
	WebDriver driver;
	@Test
	
	public void verifyTitlePage() throws IOException
	{	
		String browser=new ExcelData().xlsxSingleCellReader(1, 1);
		if(browser.equalsIgnoreCase("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Browser\\geckodriver-v0.15.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		
		/*//ExcelData ed=new ExcelData();
		Object[][] data=ExcelData.xlsxReaderManyRowsManyColumnsR();
		for(int i=0;i<1;i++) {
			for(int j=0;j<1;j++) {
				System.out.print(data[i][j]);
			}
			System.out.println();
		}*/
		
		/*
		if(BrowserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Browser\\geckodriver-v0.15.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}*/
		/*else if (BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Browser\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (BrowserName.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.opera.driver", "D:\\Browser\\operadriver_win64\\operadriver_win64\\operadriver.exe");
			driver=new OperaDriver();			
		}
		else if(BrowserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "D:\\Browser\\IEDriverServer_x64_3.3.0\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}*/
		driver.manage().window().maximize();
		driver.get("http://www.learn-automation.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	
}
