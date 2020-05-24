package com.BB;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindows {
	WebDriver driver;
	
	@Test
	public void verifyMultipleWindows() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Browser\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///D:/staticwebpage/JavaFirstParentPage.html");
		
		//String parentWindow = driver.getWindowHandle();  // It hold the ID of first page or parent page.
	
		driver.findElement(By.xpath("/html/body/li[1]/a")).click();	// clicking the url
		driver.findElement(By.xpath("/html/body/li[2]/a")).click();	// clicking the url
		driver.findElement(By.xpath("/html/body/li[3]/a")).click();	// clicking the url
		driver.findElement(By.xpath("/html/body/li[4]/a")).click();	// clicking the url
		driver.findElement(By.xpath("/html/body/li[5]/a")).click();	// clicking the url
			
		Set<String> childWindowId = driver.getWindowHandles(); // Storing all ID to 'Set' variable. 
		int numberofwindows = childWindowId.size();   // counting the number of child windows.
		
		String[] noofstrAr = new String[numberofwindows]; //Creating the number of 'string' array
		String[] childWarrays = childWindowId.toArray(noofstrAr); // Storing all child window 'set' to string array . And assigning to string array variable. 
		//Switching windows based on 'childWarrays' array index.
		driver.switchTo().window(childWarrays[0]);
		System.out.println("Parent Window id is :"+childWarrays[0]);
		Thread.sleep(5000);
		driver.switchTo().window(childWarrays[1]);
		System.out.println("Child window1 :"+childWarrays[1]);
		Thread.sleep(5000);
		driver.switchTo().window(childWarrays[0]);
		System.out.println("Parent window :"+childWarrays[0]);
		Thread.sleep(5000);
		driver.switchTo().window(childWarrays[2]);
		System.out.println("Child window2 :"+childWarrays[2]);
		Thread.sleep(5000);
		driver.switchTo().window(childWarrays[5]);
		System.out.println("Child window1 :"+childWarrays[5]);
		Thread.sleep(5000);
		driver.switchTo().window(childWarrays[3]);
		System.out.println("Child window1 :"+childWarrays[3]);
		Thread.sleep(5000);
		driver.switchTo().window(childWarrays[4]);
		System.out.println("Child window1 :"+childWarrays[4]);
		
		
	}

}
