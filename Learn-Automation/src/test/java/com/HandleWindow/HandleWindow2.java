package com.HandleWindow;

import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow2 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Browser\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///D:/staticwebpage/JavaFirstParentPage.html");
		
		String parentWindow = driver.getWindowHandle();  // It hold the ID of first page or parent page.
		driver.get("file:///D:/staticwebpage/JavaFirstParentPage.html");
		String parent=driver.getWindowHandle();
		System.out.println("Parent window id is :" +parent);
		Set<String> allwindows=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(allwindows);
		driver.switchTo().window(al.get(2));
		System.out.println("Child window id is :" +al.get(2));
		driver.close();
		driver.switchTo().window(al.get(1));
		driver.close();
		driver.switchTo().window(al.get(0));
		driver.close();
		System.out.println("Title of Parent window is :" +driver.getTitle());
	
	}
}
