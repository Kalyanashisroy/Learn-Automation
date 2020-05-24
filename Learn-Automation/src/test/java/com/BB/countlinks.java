package com.BB;

import java.awt.List;
import java.sql.Driver;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.collections.Lists;

public class countlinks {
	
	static ArrayList<String> runfunct(){
		ArrayList<String> al=new ArrayList<String>();
				al.add("Flash Movie Demo");
				al.add("Radio & Checkbox Demo");
				al.add("Table Demo");
				al.add("Accessing Link");
				al.add("Ajax Demo");
				al.add("Inside & Outside Block Level Tag");
				al.add("Yahoo");
				al.add("Tooltip");
				al.add("File Upload");
				al.add("Login");
				al.add("Social Icon");
				al.add("Selenium Auto IT");
				al.add("Selenium IDE Test");
				al.add("Guru99 Demo Page");
				al.add("Scrollbar Demo");
				al.add("File Upload using Sikuli Demo");
				al.add("Cookie Handling Demo");
				al.add("Drag and Drop Action");
				al.add("Selenium DatePicker Demo");
				//al.clear();
				//al.add("Robert");
		        return al;
	}
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/ajax.html#");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[contains(text(),'Selenium')])[1]")).click();
		Thread.sleep(5000);
		java.util.List<WebElement> links=driver.findElements(By.xpath("//a"));
	    System.out.println(links.size());
	    ArrayList<String> al=new ArrayList<String>();
	    al=runfunct();
	    //System.out.println(al.get(2));
	    for(int i=1;i<=links.size();i=i+1) {
			System.out.println(links.get(i).getText());
		}
	    driver.close();
	 }

}
