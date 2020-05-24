package com.BB;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StaticWebpage {
	 WebDriver driver;
	
	 @Test
	 public void verifyStaticPage() throws InterruptedException
	 {
		System.setProperty("webdriver.chrome.driver", "D:\\Browser\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///D:/staticwebpage/JavaFirstParentPage.html");
		Thread.sleep(5000);
		WebElement ele1=driver.findElement(By.xpath("//a[contains(text(),'This is the link for page 1')]"));
		ele1.click();
		System.out.println(ele1.getText());
		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> it=windowids.iterator();
		String parentId=it.next();
		Thread.sleep(5000);
		driver.switchTo().window(parentId);
		WebElement ele2=driver.findElement(By.xpath("//a[contains(text(),'This is the link for page 2')]"));
		ele2.click();
		System.out.println(ele2.getText());
		Thread.sleep(5000);
		driver.switchTo().window(parentId);
		WebElement ele3=driver.findElement(By.xpath("//a[contains(text(),'This is the link for page 3')]"));
		ele3.click();
		System.out.println(ele3.getText());
		Thread.sleep(5000);
		driver.switchTo().window(parentId);
		WebElement ele4=driver.findElement(By.xpath("//a[contains(text(),'This is the link for page 4')]"));
		ele4.click();
		System.out.println(ele4.getText());
		Thread.sleep(5000);
		driver.switchTo().window(parentId);
		WebElement ele5=driver.findElement(By.xpath("//a[contains(text(),'This is the link for page 5')]"));
		ele5.click();
		System.out.println(ele5.getText());
		Thread.sleep(5000);
		driver.switchTo().window(parentId);
		WebElement ele6=driver.findElement(By.xpath("//a[contains(text(),'This is the link for page 6')]"));
		ele6.click();
		System.out.println(ele6.getText());
		driver.switchTo().window(parentId);
		Thread.sleep(5000);
		ele2.click();
		driver.switchTo().window(parentId);
		Thread.sleep(5000);
		ele5.click();
		driver.switchTo().window(parentId);
		Thread.sleep(5000);
		
		driver.quit();
	}

}
