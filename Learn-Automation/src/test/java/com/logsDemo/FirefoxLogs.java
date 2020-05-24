package com.logsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLogs {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Browser\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.logfile", "./Firefoxlog.txt");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "./Firefoxlog.txt");
		//System.setProperty(FirefoxDriver, value)
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.quit();
	}

}
