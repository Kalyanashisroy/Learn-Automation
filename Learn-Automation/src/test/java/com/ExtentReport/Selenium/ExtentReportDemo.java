package com.ExtentReport.Selenium;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo {

	@Test
	public void loginTest() throws IOException {
		System.out.println("Login to gmail");
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/Learn_Automation3.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("Login Test");
		logger.log(Status.INFO, "Login to gmail");
		logger.log(Status.PASS, "Title verified");
		extent.flush();
		ExtentTest logger1=extent.createTest("Logoff Test");
		logger1.log(Status.FAIL, "Title verified");
		logger1.fail("Failed due to some issue", MediaEntityBuilder.createScreenCaptureFromPath("/D:/Screenshot/logo.gif").build());
		logger1.pass("Failed due to some issue", MediaEntityBuilder.createScreenCaptureFromPath("/D:/Screenshot/logo.gif").build());

		//logger1.addScreenCaptureFromPath("/D:/Screenshot/logo.gif");
		extent.flush();
	}
}
