package com.BB;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Windows {
	WebDriver driver;
	public void switchToWindowByIndex(int index) {
		int count = 0;
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			driver.switchTo().window(window);
			if (count == index) {
				System.out.println("Switched into window : " + index);
				break;
			}
			count++;
		}
	}

}
