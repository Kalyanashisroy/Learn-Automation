/**
 * 
 */
package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author KALYANASHIS
 *This class will store all the locator and methods of login page
 */
public class LoginPage {
	WebDriver driver;
	By username=By.id("user_login");
	By password=By.xpath(".//*[@id='user_pass']");
	By loginbutton=By.name("wp-submit");
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	public void loginToWordpress(String userid,String pass) {
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginbutton).click();
	}
	public void typeUserName(String uid) {
		driver.findElement(username).sendKeys(uid);
	}
	public void typePassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void clickOnLoginButton() {
		driver.findElement(loginbutton).click();
	}

}
