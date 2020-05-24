package com.BB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JFPP {
	WebDriver ldriver;
	void EnterCSSValue1_2(WebDriver ldriver,String css1) {
		ldriver.findElement(By.cssSelector("#firstname")).sendKeys(css1);
		
	}
	void EnterCSSValue1_3(WebDriver ldriver,String cssA,String cssB,String cssC) {
		ldriver.findElement(By.cssSelector(".classOne")).sendKeys(cssA);
		ldriver.findElement(By.cssSelector(".classTwo")).sendKeys(cssB);
		ldriver.findElement(By.name("manOne")).sendKeys(cssC);
		
	}
	void EnterCSSValue1_4(WebDriver ldriver,String cssA1,String cssB1,String cssC1,String cssD1,String cssE1) {
		ldriver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys(cssA1);
		ldriver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys(cssB1);
		ldriver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys(cssC1);
		ldriver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys(cssD1);
		ldriver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys(cssE1);
		
	}
	void PrintText(WebDriver lDriver) {
		System.out.println("Print the unordered list below :"+(lDriver.findElement(By.cssSelector("#ulist001 > li:nth-child(1)")).getText()));
		System.out.println("Print the unordered list below :" +(lDriver.findElement(By.cssSelector("#ulist001 > li:nth-child(2)")).getText()));
		System.out.println("Print the unordered list below :"+(lDriver.findElement(By.cssSelector("#ulist001 > li:nth-child(3)")).getText()));
		System.out.println("Print the unordered list below :"+(lDriver.findElement(By.cssSelector("#ulist001 > li:nth-child(4)")).getText()));
	}
	

}
