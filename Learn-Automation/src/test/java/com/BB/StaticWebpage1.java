package com.BB;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StaticWebpage1 {
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
		driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
		Thread.sleep(5000);
		Alert alt=driver.switchTo().alert();
		String alttext=alt.getText();
		System.out.println("Get the text from test me pop up :" +alttext);
		alt.accept();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		Thread.sleep(5000);
		String alttext1=alt.getText();
		System.out.println("Get the text from click media pop up :" +alttext1);
		alt.accept();
		Thread.sleep(5000);
		WebElement ele=driver.findElement(By.xpath("//button[contains(text(),' Click Me!')]"));
		ele.click();
		Thread.sleep(5000);
		ele.sendKeys(Keys.F5);
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(5000);
		WebElement radio1=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		boolean status=radio1.isSelected();
		if(status==true) {
			System.out.println("Radio button is checked");
		}
		else {
			System.out.println("Radio button is unchecked");
		}
		Thread.sleep(5000);
		WebElement ele1=driver.findElement(By.xpath("//input[@type='submit']"));
		boolean status1=ele1.isDisplayed();
		if(status1==true) {
			System.out.println("Displayed");
		}
		else {
			System.out.println("Not displayed");
		}
		ele1.click();
		Thread.sleep(5000);
		driver.quit();
	}

}
