/**
 * 
 */
package com.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpress.Pages.LoginPage;

/**
 * @author KALYANASHIS
 *
 */
public class VerifyWordpressLogin {

	@Test
	public void verifyValidLogin() {
		System.setProperty("webdriver.chrome.driver", "D:\\Browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		LoginPage login=new LoginPage(driver);
		login.typeUserName("admin");
		login.typePassword("demo123");
		login.clickOnLoginButton();
		driver.quit();
	}
}
