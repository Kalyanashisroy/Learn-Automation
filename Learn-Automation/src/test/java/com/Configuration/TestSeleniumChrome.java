package com.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utility.ConfigReader;

public class TestSeleniumChrome {
	ConfigReader config;
	@BeforeTest
	public void setUp() {
		config=new ConfigReader();
		System.setProperty("webdriver.chrome.driver", config.getChromePath());
		System.out.println("=========Setup Ready=============");
	}
	
	@Test
	public void testChrome() throws Exception {
		System.out.println("=========Test Started=============");
		WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", config.getGeckoPath());
		//WebDriver driver=new FirefoxDriver();
		//System.setProperty("webdriver.opera.driver", config.getOperaPath());
		//WebDriver driver=new OperaDriver();
		//System.setProperty("webdriver.ie.driver", config.getIEPath());
		//WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get(config.getApplicationURL());
		driver.quit();
		System.out.println("=========Test Closed=============");
	}

}
