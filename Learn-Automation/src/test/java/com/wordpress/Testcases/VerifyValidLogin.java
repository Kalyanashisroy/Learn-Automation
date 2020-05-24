package com.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Helper.BrowserFactory;
import com.wordpress.Pages.LoginPageNew;

public class VerifyValidLogin {
	
	@Test
	public void checkValidUser() {
	//This will launch browser and specific url
	WebDriver driver=BrowserFactory.startBrowser("chrome", "http://demosite.center/wordpress/wp-login.php");
	//Created page object using page factory
	LoginPageNew login_page=PageFactory.initElements(driver, LoginPageNew.class);
	//call the method
	login_page.login_wordpress("admin", "demo123");
	}
}
