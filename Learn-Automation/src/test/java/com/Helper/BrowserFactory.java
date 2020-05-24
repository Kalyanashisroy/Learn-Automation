package com.Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserFactory {
	static WebDriver driver;
	public static WebDriver startBrowser(String browsername,String url) {
		
		if (browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Browser\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Browser\\geckodriver-v0.15.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browsername.equals("Opera")) {
			System.setProperty("webdriver.opera.driver", "D:\\Browser\\operadriver_win64\\operadriver_win64\\operadriver.exe");
			driver = new OperaDriver();
		} else if (browsername.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "D:\\Browser\\IEDriverServer_x64_3.3.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
		
	}
}
